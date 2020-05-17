package typingsSlinky.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoombarProviderDataChart extends js.Object {
  def clean(): Unit = js.native
  def cleanOptsForZoom(options: js.Object): Unit = js.native
  def createClone(container: js.Object, options: js.Object): Unit = js.native
  def getBaseOpts(options: js.Object): Unit = js.native
  def setSize(width: js.Object, height: js.Object): Unit = js.native
  def syncMinWidth(minWidth: js.Object): Unit = js.native
  def targetObject(obj: js.Object): Unit = js.native
  def targetWidth(): Unit = js.native
  def update(a: js.Object, b: js.Object): Unit = js.native
  def widgetName(): Unit = js.native
}

object ZoombarProviderDataChart {
  @scala.inline
  def apply(
    clean: () => Unit,
    cleanOptsForZoom: js.Object => Unit,
    createClone: (js.Object, js.Object) => Unit,
    getBaseOpts: js.Object => Unit,
    setSize: (js.Object, js.Object) => Unit,
    syncMinWidth: js.Object => Unit,
    targetObject: js.Object => Unit,
    targetWidth: () => Unit,
    update: (js.Object, js.Object) => Unit,
    widgetName: () => Unit
  ): ZoombarProviderDataChart = {
    val __obj = js.Dynamic.literal(clean = js.Any.fromFunction0(clean), cleanOptsForZoom = js.Any.fromFunction1(cleanOptsForZoom), createClone = js.Any.fromFunction2(createClone), getBaseOpts = js.Any.fromFunction1(getBaseOpts), setSize = js.Any.fromFunction2(setSize), syncMinWidth = js.Any.fromFunction1(syncMinWidth), targetObject = js.Any.fromFunction1(targetObject), targetWidth = js.Any.fromFunction0(targetWidth), update = js.Any.fromFunction2(update), widgetName = js.Any.fromFunction0(widgetName))
    __obj.asInstanceOf[ZoombarProviderDataChart]
  }
  @scala.inline
  implicit class ZoombarProviderDataChartOps[Self <: ZoombarProviderDataChart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClean(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCleanOptsForZoom(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanOptsForZoom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateClone(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createClone")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetBaseOpts(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBaseOpts")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSize(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSyncMinWidth(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncMinWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTargetObject(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTargetWidth(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWidgetName(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgetName")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

