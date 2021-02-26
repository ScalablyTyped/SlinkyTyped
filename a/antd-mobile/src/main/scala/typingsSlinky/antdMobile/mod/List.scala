package typingsSlinky.antdMobile.mod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.antdMobile.anon.PartialListProps
import typingsSlinky.antdMobile.anon.TypeofItem
import typingsSlinky.antdMobile.listItemMod.ListItemProps
import typingsSlinky.antdMobile.listMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile", "List")
@js.native
class List () extends default
/* static members */
object List {
  
  @JSImport("antd-mobile", "List")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile", "List.Item")
  @js.native
  def Item: (Instantiable1[/* props */ ListItemProps, typingsSlinky.antdMobile.listItemMod.default]) with TypeofItem = js.native
  @scala.inline
  def Item_=(
    x: (Instantiable1[/* props */ ListItemProps, typingsSlinky.antdMobile.listItemMod.default]) with TypeofItem
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @JSImport("antd-mobile", "List.defaultProps")
  @js.native
  def defaultProps: PartialListProps = js.native
  @scala.inline
  def defaultProps_=(x: PartialListProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
