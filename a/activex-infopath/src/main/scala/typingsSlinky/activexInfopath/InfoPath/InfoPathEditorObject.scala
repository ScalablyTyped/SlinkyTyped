package typingsSlinky.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfoPathEditorObject extends js.Object {
  var DataConnectionBaseUrl: String = js.native
  var Host: js.Any = js.native
  var HostName: String = js.native
  @JSName("InfoPath.InfoPathEditorObject_typekey")
  var InfoPathDotInfoPathEditorObject_typekey: InfoPathEditorObject = js.native
  val XDocument: _XDocument = js.native
  def CloseDocument(): Unit = js.native
  def FlushDocument(): Unit = js.native
  def Load(bstrURL: String): Unit = js.native
  def LoadFromStream(punkStream: js.Any): Unit = js.native
  def NewFromSolution(bstrSolutionURI: String): Unit = js.native
  def NewFromSolutionWithData(bstrURLXSN: String, punkStream: js.Any, dwBehavior: Double): Unit = js.native
  def SetInitEventHandler(handler: IInitEventHandler): Unit = js.native
  def SetNotifyHostEventHandler(pHandler: INotifyHostEventHandler): Unit = js.native
  def SetSubmitToHostEventHandler(pHandler: ISubmitToHostEventHandler): Unit = js.native
}

object InfoPathEditorObject {
  @scala.inline
  def apply(
    CloseDocument: () => Unit,
    DataConnectionBaseUrl: String,
    FlushDocument: () => Unit,
    Host: js.Any,
    HostName: String,
    InfoPathDotInfoPathEditorObject_typekey: InfoPathEditorObject,
    Load: String => Unit,
    LoadFromStream: js.Any => Unit,
    NewFromSolution: String => Unit,
    NewFromSolutionWithData: (String, js.Any, Double) => Unit,
    SetInitEventHandler: IInitEventHandler => Unit,
    SetNotifyHostEventHandler: INotifyHostEventHandler => Unit,
    SetSubmitToHostEventHandler: ISubmitToHostEventHandler => Unit,
    XDocument: _XDocument
  ): InfoPathEditorObject = {
    val __obj = js.Dynamic.literal(CloseDocument = js.Any.fromFunction0(CloseDocument), DataConnectionBaseUrl = DataConnectionBaseUrl.asInstanceOf[js.Any], FlushDocument = js.Any.fromFunction0(FlushDocument), Host = Host.asInstanceOf[js.Any], HostName = HostName.asInstanceOf[js.Any], Load = js.Any.fromFunction1(Load), LoadFromStream = js.Any.fromFunction1(LoadFromStream), NewFromSolution = js.Any.fromFunction1(NewFromSolution), NewFromSolutionWithData = js.Any.fromFunction3(NewFromSolutionWithData), SetInitEventHandler = js.Any.fromFunction1(SetInitEventHandler), SetNotifyHostEventHandler = js.Any.fromFunction1(SetNotifyHostEventHandler), SetSubmitToHostEventHandler = js.Any.fromFunction1(SetSubmitToHostEventHandler), XDocument = XDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.InfoPathEditorObject_typekey")(InfoPathDotInfoPathEditorObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoPathEditorObject]
  }
  @scala.inline
  implicit class InfoPathEditorObjectOps[Self <: InfoPathEditorObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseDocument(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloseDocument")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDataConnectionBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataConnectionBaseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlushDocument(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlushDocument")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHost(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoPathDotInfoPathEditorObject_typekey(value: InfoPathEditorObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.InfoPathEditorObject_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoad(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoadFromStream(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadFromStream")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNewFromSolution(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewFromSolution")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNewFromSolutionWithData(value: (String, js.Any, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewFromSolutionWithData")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetInitEventHandler(value: IInitEventHandler => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetInitEventHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetNotifyHostEventHandler(value: INotifyHostEventHandler => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetNotifyHostEventHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSubmitToHostEventHandler(value: ISubmitToHostEventHandler => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetSubmitToHostEventHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withXDocument(value: _XDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XDocument")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

