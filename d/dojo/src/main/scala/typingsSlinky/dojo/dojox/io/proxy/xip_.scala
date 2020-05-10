package typingsSlinky.dojo.dojox.io.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/io/proxy/xip.html
  *
  * Object that implements the iframe handling for XMLHttpRequest
  * IFrame Proxying.
  *
  * Do not use this object directly. See the Dojo Book page
  * on XMLHttpRequest IFrame Proxying:
  * http://dojotoolkit.org/book/dojo-book-0-4/part-5-connecting-pieces/i-o/cross-domain-xmlhttprequest-using-iframe-proxy
  * Usage of XHR IFrame Proxying does not work from local disk in Safari.
  *
  */
@js.native
trait xip_ extends js.Object {
  /**
    *
    */
  var urlLimit: Double = js.native
  /**
    *
    */
  var xipClientUrl: js.Object = js.native
  /**
    * XMLHttpRequest facade object used by dojox.io.proxy.xip.
    *
    * Do not use this object directly. See the Dojo Book page
    * on XMLHttpRequest IFrame Proxying:
    * http://dojotoolkit.org/book/dojo-book-0-4/part-5-connecting-pieces/i-o/cross-domain-xmlhttprequest-using-iframe-proxy
    *
    * @param ifpServerUrl
    */
  def XhrIframeFacade(ifpServerUrl: js.Any): Unit = js.native
  /**
    *
    */
  def createFacade(): js.Any = js.native
  /**
    *
    * @param stateId
    */
  def destroyState(stateId: String): Unit = js.native
  /**
    *
    * @param frag
    */
  def fragmentReceived(frag: js.Any): Unit = js.native
  /**
    * HTML5 document messaging endpoint. Unpack the event to see if we want to use it.
    *
    * @param evt
    */
  def fragmentReceivedEvent(evt: js.Any): Unit = js.native
  /**
    *
    * @param stateId
    */
  def frameLoaded(stateId: String): Unit = js.native
  /**
    *
    * @param stateId
    * @param cmd
    * @param message
    */
  def makeServerUrl(stateId: js.Any, cmd: js.Any, message: js.Any): String = js.native
  /**
    *
    * @param stateId
    * @param urlEncodedData
    */
  def receive(stateId: String, urlEncodedData: String): Unit = js.native
  /**
    * starts the xdomain request using the provided facade.
    * This method first does some init work, then delegates to _realSend.
    *
    * @param facade
    */
  def send(facade: js.Object): js.Any = js.native
  /**
    *
    * @param stateId
    * @param encodedData
    */
  def sendRequest(stateId: js.Any, encodedData: js.Any): Unit = js.native
  /**
    *
    * @param stateId
    */
  def sendRequestPart(stateId: js.Any): Unit = js.native
  /**
    *
    * @param stateId
    */
  def sendRequestStart(stateId: js.Any): Unit = js.native
  /**
    *
    * @param stateId
    * @param cmd
    * @param message
    */
  def setServerUrl(stateId: js.Any, cmd: js.Any, message: js.Any): Unit = js.native
  /**
    *
    * @param encodedMessage
    */
  def unpackMessage(encodedMessage: js.Any): js.Object = js.native
}

object xip_ {
  @scala.inline
  def apply(
    XhrIframeFacade: js.Any => Unit,
    createFacade: () => js.Any,
    destroyState: String => Unit,
    fragmentReceived: js.Any => Unit,
    fragmentReceivedEvent: js.Any => Unit,
    frameLoaded: String => Unit,
    makeServerUrl: (js.Any, js.Any, js.Any) => String,
    receive: (String, String) => Unit,
    send: js.Object => js.Any,
    sendRequest: (js.Any, js.Any) => Unit,
    sendRequestPart: js.Any => Unit,
    sendRequestStart: js.Any => Unit,
    setServerUrl: (js.Any, js.Any, js.Any) => Unit,
    unpackMessage: js.Any => js.Object,
    urlLimit: Double,
    xipClientUrl: js.Object
  ): xip_ = {
    val __obj = js.Dynamic.literal(XhrIframeFacade = js.Any.fromFunction1(XhrIframeFacade), createFacade = js.Any.fromFunction0(createFacade), destroyState = js.Any.fromFunction1(destroyState), fragmentReceived = js.Any.fromFunction1(fragmentReceived), fragmentReceivedEvent = js.Any.fromFunction1(fragmentReceivedEvent), frameLoaded = js.Any.fromFunction1(frameLoaded), makeServerUrl = js.Any.fromFunction3(makeServerUrl), receive = js.Any.fromFunction2(receive), send = js.Any.fromFunction1(send), sendRequest = js.Any.fromFunction2(sendRequest), sendRequestPart = js.Any.fromFunction1(sendRequestPart), sendRequestStart = js.Any.fromFunction1(sendRequestStart), setServerUrl = js.Any.fromFunction3(setServerUrl), unpackMessage = js.Any.fromFunction1(unpackMessage), urlLimit = urlLimit.asInstanceOf[js.Any], xipClientUrl = xipClientUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[xip_]
  }
  @scala.inline
  implicit class xip_Ops[Self <: xip_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXhrIframeFacade(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XhrIframeFacade")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateFacade(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFacade")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDestroyState(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFragmentReceived(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentReceived")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFragmentReceivedEvent(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentReceivedEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFrameLoaded(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameLoaded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMakeServerUrl(value: (js.Any, js.Any, js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makeServerUrl")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withReceive(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receive")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSend(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSendRequest(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendRequest")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSendRequestPart(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendRequestPart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSendRequestStart(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendRequestStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetServerUrl(value: (js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setServerUrl")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUnpackMessage(value: js.Any => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpackMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUrlLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXipClientUrl(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xipClientUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

