package typingsSlinky.reactDnd.decorateHandlerMod

import slinky.core.facade.ReactRef
import typingsSlinky.dndCore.interfacesMod.DragDropManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecorateHandlerArgs[Props, ItemIdType] extends js.Object {
  var DecoratedComponent: js.Any = js.native
  var collect: js.Any = js.native
  var containerDisplayName: String = js.native
  var createConnector: js.Any = js.native
  var options: js.Any = js.native
  var registerHandler: js.Any = js.native
  def createHandler(monitor: HandlerReceiver, ref: ReactRef[_]): Handler[Props] = js.native
  def createMonitor(manager: DragDropManager): HandlerReceiver = js.native
  def getType(props: Props): ItemIdType = js.native
}

object DecorateHandlerArgs {
  @scala.inline
  def apply[Props, ItemIdType](
    DecoratedComponent: js.Any,
    collect: js.Any,
    containerDisplayName: String,
    createConnector: js.Any,
    createHandler: (HandlerReceiver, ReactRef[_]) => Handler[Props],
    createMonitor: DragDropManager => HandlerReceiver,
    getType: Props => ItemIdType,
    options: js.Any,
    registerHandler: js.Any
  ): DecorateHandlerArgs[Props, ItemIdType] = {
    val __obj = js.Dynamic.literal(DecoratedComponent = DecoratedComponent.asInstanceOf[js.Any], collect = collect.asInstanceOf[js.Any], containerDisplayName = containerDisplayName.asInstanceOf[js.Any], createConnector = createConnector.asInstanceOf[js.Any], createHandler = js.Any.fromFunction2(createHandler), createMonitor = js.Any.fromFunction1(createMonitor), getType = js.Any.fromFunction1(getType), options = options.asInstanceOf[js.Any], registerHandler = registerHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorateHandlerArgs[Props, ItemIdType]]
  }
  @scala.inline
  implicit class DecorateHandlerArgsOps[Self[props, itemidtype] <: DecorateHandlerArgs[props, itemidtype], Props, ItemIdType] (val x: Self[Props, ItemIdType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Props, ItemIdType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Props, ItemIdType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Props, ItemIdType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Props, ItemIdType]) with Other]
    @scala.inline
    def withDecoratedComponent(value: js.Any): Self[Props, ItemIdType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DecoratedComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollect(value: js.Any): Self[Props, ItemIdType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerDisplayName(value: String): Self[Props, ItemIdType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateConnector(value: js.Any): Self[Props, ItemIdType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createConnector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateHandler(value: (HandlerReceiver, ReactRef[_]) => Handler[Props]): Self[Props, ItemIdType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateMonitor(value: DragDropManager => HandlerReceiver): Self[Props, ItemIdType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createMonitor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetType(value: Props => ItemIdType): Self[Props, ItemIdType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOptions(value: js.Any): Self[Props, ItemIdType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegisterHandler(value: js.Any): Self[Props, ItemIdType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerHandler")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

