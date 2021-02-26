package typingsSlinky.antd.mod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.Call
import typingsSlinky.antd.anon.CallDefaultProps
import typingsSlinky.antd.anon.DefaultProps
import typingsSlinky.antd.skeletonImageMod.SkeletonImageProps
import typingsSlinky.antd.skeletonSkeletonMod.SkeletonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Skeleton {
  
  @JSImport("antd", "Skeleton")
  @js.native
  def apply(props: SkeletonProps): ReactElement = js.native
  @JSImport("antd", "Skeleton")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd", "Skeleton.Avatar")
  @js.native
  def Avatar: DefaultProps = js.native
  @scala.inline
  def Avatar_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Avatar")(x.asInstanceOf[js.Any])
  
  @JSImport("antd", "Skeleton.Button")
  @js.native
  def Button: Call = js.native
  @scala.inline
  def Button_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Button")(x.asInstanceOf[js.Any])
  
  @JSImport("antd", "Skeleton.Image")
  @js.native
  def Image(props: SkeletonImageProps): ReactElement = js.native
  
  @JSImport("antd", "Skeleton.Input")
  @js.native
  def Input: CallDefaultProps = js.native
  @scala.inline
  def Input_=(x: CallDefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Input")(x.asInstanceOf[js.Any])
  
  @JSImport("antd", "Skeleton.defaultProps")
  @js.native
  def defaultProps: typingsSlinky.antd.anon.Avatar = js.native
  @scala.inline
  def defaultProps_=(x: typingsSlinky.antd.anon.Avatar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
