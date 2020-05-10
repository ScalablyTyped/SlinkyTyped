package typingsSlinky.openfin.windowMod

import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowPerformanceReport[Topic, Type] extends WindowEvent[Topic, Type] {
  var navigation: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.performance.navigation */ js.Any = js.native
  var timeOrigin: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.performance.timeOrigin */ js.Any = js.native
  var timing: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.performance.timing */ js.Any = js.native
}

object WindowPerformanceReport {
  @scala.inline
  def apply[Topic, Type](
    name: String,
    navigation: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.performance.navigation */ js.Any,
    timeOrigin: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.performance.timeOrigin */ js.Any,
    timing: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.performance.timing */ js.Any,
    topic: Topic,
    `type`: Type,
    uuid: String
  ): WindowPerformanceReport[Topic, Type] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], timeOrigin = timeOrigin.asInstanceOf[js.Any], timing = timing.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowPerformanceReport[Topic, Type]]
  }
  @scala.inline
  implicit class WindowPerformanceReportOps[Self[topic, `type`] <: WindowPerformanceReport[topic, `type`], Topic, Type] (val x: Self[Topic, Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Topic, Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Topic, Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Topic, Type]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Topic, Type]) with Other]
    @scala.inline
    def withNavigation(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.performance.navigation */ js.Any
    ): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeOrigin(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.performance.timeOrigin */ js.Any
    ): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTiming(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.performance.timing */ js.Any
    ): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

