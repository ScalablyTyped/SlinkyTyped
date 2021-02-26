package typingsSlinky.antd.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antd.descriptionsMod.DescriptionsProps
import typingsSlinky.antd.itemMod.DescriptionsItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Descriptions {
  
  @JSImport("antd", "Descriptions")
  @js.native
  def apply(hasPrefixClsTitleExtraColumnColonBorderedLayoutChildrenClassNameStyleSize: DescriptionsProps): ReactElement = js.native
  @JSImport("antd", "Descriptions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd", "Descriptions.Item")
  @js.native
  def Item: ReactComponentClass[DescriptionsItemProps] = js.native
  @scala.inline
  def Item_=(x: ReactComponentClass[DescriptionsItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
}
