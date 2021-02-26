package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.internalMod.AbstractEnum
import typingsSlinky.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ImageSizeUnit")
@js.native
class ImageSizeUnit protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ImageSizeUnit {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ImageSizeUnit")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ImageSizeUnit.Auto")
  @js.native
  def Auto: ImageSizeUnit = js.native
  @scala.inline
  def Auto_=(x: ImageSizeUnit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Auto")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ImageSizeUnit.Percentage")
  @js.native
  def Percentage: ImageSizeUnit = js.native
  @scala.inline
  def Percentage_=(x: ImageSizeUnit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Percentage")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ImageSizeUnit.Pixels")
  @js.native
  def Pixels: ImageSizeUnit = js.native
  @scala.inline
  def Pixels_=(x: ImageSizeUnit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pixels")(x.asInstanceOf[js.Any])
}
