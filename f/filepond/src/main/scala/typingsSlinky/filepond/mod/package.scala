package typingsSlinky.filepond

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type FetchServerConfigFunction = js.Function6[
    /* url */ java.lang.String, 
    /* load */ js.Function1[
      /* file */ typingsSlinky.filepond.mod.ActualFileObject | org.scalajs.dom.raw.Blob, 
      scala.Unit
    ], 
    /* error */ js.Function1[/* errorText */ java.lang.String, scala.Unit], 
    /* progress */ typingsSlinky.filepond.mod.ProgressServerConfigFunction, 
    /* abort */ js.Function0[scala.Unit], 
    /* headers */ js.Function1[/* headersString */ java.lang.String, scala.Unit], 
    scala.Unit
  ]
  
  type LoadServerConfigFunction = js.Function6[
    /* source */ js.Any, 
    /* load */ js.Function1[
      /* file */ typingsSlinky.filepond.mod.ActualFileObject | org.scalajs.dom.raw.Blob, 
      scala.Unit
    ], 
    /* error */ js.Function1[/* errorText */ java.lang.String, scala.Unit], 
    /* progress */ typingsSlinky.filepond.mod.ProgressServerConfigFunction, 
    /* abort */ js.Function0[scala.Unit], 
    /* headers */ js.Function1[/* headersString */ java.lang.String, scala.Unit], 
    scala.Unit
  ]
  
  @scala.inline
  def OptionTypes: js.Object = typingsSlinky.filepond.mod.^.asInstanceOf[js.Dynamic].selectDynamic("OptionTypes").asInstanceOf[js.Object]
  
  type ProcessServerConfigFunction = js.Function7[
    /* fieldName */ java.lang.String, 
    /* file */ typingsSlinky.filepond.mod.ActualFileObject, 
    /* metadata */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* load */ js.Function1[
      /* p */ java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any], 
      scala.Unit
    ], 
    /* error */ js.Function1[/* errorText */ java.lang.String, scala.Unit], 
    /* progress */ typingsSlinky.filepond.mod.ProgressServerConfigFunction, 
    /* abort */ js.Function0[scala.Unit], 
    scala.Unit
  ]
  
  type ProgressServerConfigFunction = js.Function3[
    /* isLengthComputable */ scala.Boolean, 
    /* loadedDataAmount */ scala.Double, 
    /* totalDataAmount */ scala.Double, 
    scala.Unit
  ]
  
  type RemoveServerConfigFunction = js.Function3[
    /* source */ js.Any, 
    /* load */ js.Function0[scala.Unit], 
    /* error */ js.Function1[/* errorText */ java.lang.String, scala.Unit], 
    scala.Unit
  ]
  
  type RestoreServerConfigFunction = js.Function6[
    /* uniqueFileId */ js.Any, 
    /* load */ js.Function1[/* file */ typingsSlinky.filepond.mod.ActualFileObject, scala.Unit], 
    /* error */ js.Function1[/* errorText */ java.lang.String, scala.Unit], 
    /* progress */ typingsSlinky.filepond.mod.ProgressServerConfigFunction, 
    /* abort */ js.Function0[scala.Unit], 
    /* headers */ js.Function1[/* headersString */ java.lang.String, scala.Unit], 
    scala.Unit
  ]
  
  type RevertServerConfigFunction = js.Function3[
    /* uniqueFieldId */ js.Any, 
    /* load */ js.Function0[scala.Unit], 
    /* error */ js.Function1[/* errorText */ java.lang.String, scala.Unit], 
    scala.Unit
  ]
  
  @scala.inline
  def create(): typingsSlinky.filepond.anon.FilePond = typingsSlinky.filepond.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsSlinky.filepond.anon.FilePond]
  @scala.inline
  def create(element: js.UndefOr[scala.Nothing], options: typingsSlinky.filepond.mod.FilePondOptions): typingsSlinky.filepond.anon.FilePond = (typingsSlinky.filepond.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.filepond.anon.FilePond]
  @scala.inline
  def create(element: org.scalajs.dom.raw.Element): typingsSlinky.filepond.anon.FilePond = typingsSlinky.filepond.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.filepond.anon.FilePond]
  @scala.inline
  def create(element: org.scalajs.dom.raw.Element, options: typingsSlinky.filepond.mod.FilePondOptions): typingsSlinky.filepond.anon.FilePond = (typingsSlinky.filepond.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.filepond.anon.FilePond]
  
  @scala.inline
  def destroy(element: org.scalajs.dom.raw.Element): scala.Unit = typingsSlinky.filepond.mod.^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(element.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def find(element: org.scalajs.dom.raw.Element): typingsSlinky.filepond.anon.FilePond = typingsSlinky.filepond.mod.^.asInstanceOf[js.Dynamic].applyDynamic("find")(element.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.filepond.anon.FilePond]
  
  @scala.inline
  def getOptions(): typingsSlinky.filepond.mod.FilePondOptions = typingsSlinky.filepond.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")().asInstanceOf[typingsSlinky.filepond.mod.FilePondOptions]
  
  @scala.inline
  def parse(context: org.scalajs.dom.raw.Element): scala.Unit = typingsSlinky.filepond.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(context.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def registerPlugin(plugins: js.Any*): scala.Unit = typingsSlinky.filepond.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(plugins.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setOptions(options: typingsSlinky.filepond.mod.FilePondOptions): scala.Unit = typingsSlinky.filepond.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def supported(): scala.Boolean = typingsSlinky.filepond.mod.^.asInstanceOf[js.Dynamic].applyDynamic("supported")().asInstanceOf[scala.Boolean]
}
