package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.internalMod.AbstractEnum
import typingsSlinky.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.EnumFormat")
@js.native
class EnumFormat protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object EnumFormat {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.EnumFormat")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.EnumFormat.Image")
  @js.native
  def Image: EnumFormat = js.native
  @scala.inline
  def Image_=(x: EnumFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Image")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.EnumFormat.Text")
  @js.native
  def Text: EnumFormat = js.native
  @scala.inline
  def Text_=(x: EnumFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
}
