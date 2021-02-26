package typingsSlinky.blueprintjsCore.componentsMod

import typingsSlinky.blueprintjsCore.anon.ValidationMapIPortalConte
import typingsSlinky.blueprintjsCore.portalMod.IPortalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Portal")
@js.native
class Portal protected ()
  extends typingsSlinky.blueprintjsCore.portalMod.Portal {
  def this(props: IPortalProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: IPortalProps, context: js.Any) = this()
}
/* static members */
object Portal {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Portal")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Portal.contextTypes")
  @js.native
  def contextTypes: ValidationMapIPortalConte = js.native
  @scala.inline
  def contextTypes_=(x: ValidationMapIPortalConte): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Portal.defaultProps")
  @js.native
  def defaultProps: IPortalProps = js.native
  @scala.inline
  def defaultProps_=(x: IPortalProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Portal.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
