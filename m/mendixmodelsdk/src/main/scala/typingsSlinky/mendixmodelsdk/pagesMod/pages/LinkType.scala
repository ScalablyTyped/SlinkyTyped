package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.internalMod.AbstractEnum
import typingsSlinky.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkType")
@js.native
class LinkType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object LinkType {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkType.Call")
  @js.native
  def Call: LinkType = js.native
  @scala.inline
  def Call_=(x: LinkType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Call")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkType.Email")
  @js.native
  def Email: LinkType = js.native
  @scala.inline
  def Email_=(x: LinkType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Email")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkType.Text")
  @js.native
  def Text: LinkType = js.native
  @scala.inline
  def Text_=(x: LinkType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkType.Web")
  @js.native
  def Web: LinkType = js.native
  @scala.inline
  def Web_=(x: LinkType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Web")(x.asInstanceOf[js.Any])
}
