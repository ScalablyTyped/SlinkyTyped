package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.internalMod.AbstractEnum
import typingsSlinky.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SearchFieldType")
@js.native
class SearchFieldType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object SearchFieldType {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SearchFieldType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SearchFieldType.Hidden")
  @js.native
  def Hidden: SearchFieldType = js.native
  @scala.inline
  def Hidden_=(x: SearchFieldType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Hidden")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SearchFieldType.Normal")
  @js.native
  def Normal: SearchFieldType = js.native
  @scala.inline
  def Normal_=(x: SearchFieldType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Normal")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SearchFieldType.ReadOnly")
  @js.native
  def ReadOnly: SearchFieldType = js.native
  @scala.inline
  def ReadOnly_=(x: SearchFieldType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReadOnly")(x.asInstanceOf[js.Any])
}
