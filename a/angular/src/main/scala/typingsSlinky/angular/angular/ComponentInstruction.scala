package typingsSlinky.angular.angular

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `ComponentInstruction` represents the route state for a single component. An `Instruction` is
  * composed of a tree of these `ComponentInstruction`s.
  *
  * `ComponentInstructions` is a public API. Instances of `ComponentInstruction` are passed
  * to route lifecycle hooks, like {@link CanActivate}.
  *
  * `ComponentInstruction`s are [https://en.wikipedia.org/wiki/Hash_consing](hash consed). You should
  * never construct one yourself with "new." Instead, rely on {@link Router/RouteRecognizer} to
  * construct `ComponentInstruction`s.
  *
  * You should not modify this object. It should be treated as immutable.
  */
@js.native
trait ComponentInstruction extends js.Object {
  var componentType: js.Any = js.native
  var data: RouteData = js.native
  var params: StringDictionary[js.Any] = js.native
  var reuse: Boolean = js.native
  var routeData: RouteData = js.native
  var specificity: Double = js.native
  var terminal: Boolean = js.native
  var urlParams: js.Array[String] = js.native
  var urlPath: String = js.native
}

object ComponentInstruction {
  @scala.inline
  def apply(
    componentType: js.Any,
    data: RouteData,
    params: StringDictionary[js.Any],
    reuse: Boolean,
    routeData: RouteData,
    specificity: Double,
    terminal: Boolean,
    urlParams: js.Array[String],
    urlPath: String
  ): ComponentInstruction = {
    val __obj = js.Dynamic.literal(componentType = componentType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], reuse = reuse.asInstanceOf[js.Any], routeData = routeData.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any], terminal = terminal.asInstanceOf[js.Any], urlParams = urlParams.asInstanceOf[js.Any], urlPath = urlPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentInstruction]
  }
  @scala.inline
  implicit class ComponentInstructionOps[Self <: ComponentInstruction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: RouteData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReuse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reuse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouteData(value: RouteData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecificity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specificity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTerminal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrlParams(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrlPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

