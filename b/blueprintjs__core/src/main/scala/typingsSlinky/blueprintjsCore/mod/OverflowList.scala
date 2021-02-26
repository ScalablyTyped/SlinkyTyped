package typingsSlinky.blueprintjsCore.mod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.blueprintjsCore.anon.PartialIOverflowListPropsClassName
import typingsSlinky.blueprintjsCore.overflowListMod.IOverflowListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "OverflowList")
@js.native
class OverflowList[T] protected ()
  extends typingsSlinky.blueprintjsCore.componentsMod.OverflowList[T] {
  def this(props: IOverflowListProps[T]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: IOverflowListProps[T], context: js.Any) = this()
}
/* static members */
object OverflowList {
  
  @JSImport("@blueprintjs/core", "OverflowList")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "OverflowList.defaultProps")
  @js.native
  def defaultProps: PartialIOverflowListPropsClassName = js.native
  @scala.inline
  def defaultProps_=(x: PartialIOverflowListPropsClassName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "OverflowList.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "OverflowList.ofType")
  @js.native
  def ofType[U](): Instantiable1[
    /* props */ IOverflowListProps[U], 
    typingsSlinky.blueprintjsCore.overflowListMod.OverflowList[U]
  ] = js.native
}
