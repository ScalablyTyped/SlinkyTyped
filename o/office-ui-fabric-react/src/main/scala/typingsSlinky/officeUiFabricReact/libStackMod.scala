package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.anon.PartialIStackProps
import typingsSlinky.officeUiFabricReact.anon.WeakValidationMapIStackPr
import typingsSlinky.officeUiFabricReact.stackItemTypesMod.IStackItemProps
import typingsSlinky.officeUiFabricReact.stackTypesMod.IStackProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStackMod {
  
  /* Inlined react.react.FunctionComponent<office-ui-fabric-react.office-ui-fabric-react/lib/components/Stack/Stack.types.IStackProps> & {  Item :react.react.FunctionComponent<office-ui-fabric-react.office-ui-fabric-react/lib/components/Stack/StackItem/StackItem.types.IStackItemProps>} */
  object Stack {
    
    @JSImport("office-ui-fabric-react/lib/Stack", "Stack")
    @js.native
    def apply(props: PropsWithChildren[IStackProps]): ReactElement | Null = js.native
    @JSImport("office-ui-fabric-react/lib/Stack", "Stack")
    @js.native
    def apply(props: PropsWithChildren[IStackProps], context: js.Any): ReactElement | Null = js.native
    @JSImport("office-ui-fabric-react/lib/Stack", "Stack")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Stack", "Stack.Item")
    @js.native
    def Item: ReactComponentClass[IStackItemProps] = js.native
    @scala.inline
    def Item_=(x: ReactComponentClass[IStackItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/Stack", "Stack.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/Stack", "Stack.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialIStackProps] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialIStackProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/Stack", "Stack.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/Stack", "Stack.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapIStackPr] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapIStackPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Stack", "StackItem")
  @js.native
  val StackItem: ReactComponentClass[IStackItemProps] = js.native
}
