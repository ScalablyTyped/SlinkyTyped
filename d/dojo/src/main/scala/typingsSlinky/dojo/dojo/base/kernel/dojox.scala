package typingsSlinky.dojo.dojo.base.kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.dojox.html
  *
  *
  */
@js.native
trait dojox extends js.Object {
  /**
    *
    */
  var BidiComplex: js.Object = js.native
  /**
    *
    */
  var analytics: js.Object = js.native
  /**
    *
    */
  var app: js.Object = js.native
  /**
    *
    */
  var atom: js.Object = js.native
  /**
    *
    */
  var av: js.Object = js.native
  /**
    *
    */
  var calc: js.Object = js.native
  /**
    *
    */
  var calendar: js.Object = js.native
  /**
    *
    */
  var charting: js.Object = js.native
  /**
    *
    */
  var collections: js.Object = js.native
  /**
    *
    */
  var color: js.Object = js.native
  /**
    *
    */
  var css3: js.Object = js.native
  /**
    *
    */
  var data: js.Object = js.native
  /**
    *
    */
  var date: js.Object = js.native
  /**
    *
    */
  var dgauges: js.Object = js.native
  /**
    *
    */
  var dnd: js.Object = js.native
  /**
    *
    */
  var drawing: js.Object = js.native
  /**
    *
    */
  var dtl: js.Object = js.native
  /**
    *
    */
  var editor: js.Object = js.native
  /**
    *
    */
  var embed: js.Object = js.native
  /**
    *
    */
  var encoding: js.Object = js.native
  /**
    *
    */
  var enhanced: js.Object = js.native
  /**
    * Utilities to embed and communicate with the Flash player from Javascript
    *
    */
  var flash: js.Object = js.native
  /**
    *
    */
  var form: js.Object = js.native
  /**
    *
    */
  var fx: js.Object = js.native
  /**
    *
    */
  var gantt: js.Object = js.native
  /**
    *
    */
  var gauges: js.Object = js.native
  /**
    *
    */
  var geo: js.Object = js.native
  /**
    *
    */
  var gesture: js.Object = js.native
  /**
    *
    */
  var gfx: js.Object = js.native
  /**
    *
    */
  var gfx3d: js.Object = js.native
  /**
    *
    */
  var grid: js.Object = js.native
  /**
    *
    */
  var help: js.Object = js.native
  /**
    *
    */
  var highlight: js.Object = js.native
  /**
    *
    */
  var html: js.Object = js.native
  /**
    *
    */
  var image: js.Object = js.native
  /**
    *
    */
  var io: js.Object = js.native
  /**
    *
    */
  var jq: js.Object = js.native
  /**
    *
    */
  var json: js.Object = js.native
  /**
    *
    */
  var jsonPath: js.Object = js.native
  /**
    *
    */
  var lang: js.Object = js.native
  /**
    *
    */
  var layout: js.Object = js.native
  /**
    *
    */
  var math: js.Object = js.native
  /**
    *
    */
  var mdnd: js.Object = js.native
  /**
    *
    */
  var mobile: js.Object = js.native
  /**
    *
    */
  var mvc: js.Object = js.native
  /**
    *
    */
  var openlayers: js.Object = js.native
  /**
    *
    */
  var rails: js.Object = js.native
  /**
    *
    */
  var robot: js.Object = js.native
  /**
    *
    */
  var rpc: js.Object = js.native
  /**
    *
    */
  var secure: js.Object = js.native
  /**
    *
    */
  var sketch: js.Object = js.native
  /**
    *
    */
  var sql: js.Object = js.native
  /**
    *
    */
  var string: js.Object = js.native
  /**
    *
    */
  var testing: js.Object = js.native
  /**
    *
    */
  var timing: js.Object = js.native
  /**
    *
    */
  var treemap: js.Object = js.native
  /**
    *
    */
  var uuid: js.Object = js.native
  /**
    *
    */
  var validate: js.Object = js.native
  /**
    *
    */
  var widget: js.Object = js.native
  /**
    *
    */
  var xml: js.Object = js.native
  /**
    * Provides a simple socket connection using WebSocket, or alternate
    * communication mechanisms in legacy browsers for comet-style communication. This is based
    * on the WebSocket API and returns an object that implements the WebSocket interface:
    * http://dev.w3.org/html5/websockets/#websocket
    * Provides socket connections. This can be used with virtually any Comet protocol.
    *
    * @param argsOrUrl This uses the same arguments as the other I/O functions in Dojo, or aURL to connect to. The URL should be a relative URL in order to properlywork with WebSockets (it can still be host relative, like //other-site.org/endpoint)
    */
  def socket(argsOrUrl: js.Object): js.Any = js.native
  /**
    *
    * @param format
    * @param filler
    */
  def sprintf(format: String, filler: js.Any): Unit = js.native
}

object dojox {
  @scala.inline
  def apply(
    BidiComplex: js.Object,
    analytics: js.Object,
    app: js.Object,
    atom: js.Object,
    av: js.Object,
    calc: js.Object,
    calendar: js.Object,
    charting: js.Object,
    collections: js.Object,
    color: js.Object,
    css3: js.Object,
    data: js.Object,
    date: js.Object,
    dgauges: js.Object,
    dnd: js.Object,
    drawing: js.Object,
    dtl: js.Object,
    editor: js.Object,
    embed: js.Object,
    encoding: js.Object,
    enhanced: js.Object,
    flash: js.Object,
    form: js.Object,
    fx: js.Object,
    gantt: js.Object,
    gauges: js.Object,
    geo: js.Object,
    gesture: js.Object,
    gfx: js.Object,
    gfx3d: js.Object,
    grid: js.Object,
    help: js.Object,
    highlight: js.Object,
    html: js.Object,
    image: js.Object,
    io: js.Object,
    jq: js.Object,
    json: js.Object,
    jsonPath: js.Object,
    lang: js.Object,
    layout: js.Object,
    math: js.Object,
    mdnd: js.Object,
    mobile: js.Object,
    mvc: js.Object,
    openlayers: js.Object,
    rails: js.Object,
    robot: js.Object,
    rpc: js.Object,
    secure: js.Object,
    sketch: js.Object,
    socket: js.Object => js.Any,
    sprintf: (String, js.Any) => Unit,
    sql: js.Object,
    string: js.Object,
    testing: js.Object,
    timing: js.Object,
    treemap: js.Object,
    uuid: js.Object,
    validate: js.Object,
    widget: js.Object,
    xml: js.Object
  ): dojox = {
    val __obj = js.Dynamic.literal(BidiComplex = BidiComplex.asInstanceOf[js.Any], analytics = analytics.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], atom = atom.asInstanceOf[js.Any], av = av.asInstanceOf[js.Any], calc = calc.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], charting = charting.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], css3 = css3.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dgauges = dgauges.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], drawing = drawing.asInstanceOf[js.Any], dtl = dtl.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], enhanced = enhanced.asInstanceOf[js.Any], flash = flash.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], fx = fx.asInstanceOf[js.Any], gantt = gantt.asInstanceOf[js.Any], gauges = gauges.asInstanceOf[js.Any], geo = geo.asInstanceOf[js.Any], gesture = gesture.asInstanceOf[js.Any], gfx = gfx.asInstanceOf[js.Any], gfx3d = gfx3d.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], io = io.asInstanceOf[js.Any], jq = jq.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], jsonPath = jsonPath.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], math = math.asInstanceOf[js.Any], mdnd = mdnd.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], mvc = mvc.asInstanceOf[js.Any], openlayers = openlayers.asInstanceOf[js.Any], rails = rails.asInstanceOf[js.Any], robot = robot.asInstanceOf[js.Any], rpc = rpc.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], sketch = sketch.asInstanceOf[js.Any], socket = js.Any.fromFunction1(socket), sprintf = js.Any.fromFunction2(sprintf), sql = sql.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], testing = testing.asInstanceOf[js.Any], timing = timing.asInstanceOf[js.Any], treemap = treemap.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any], widget = widget.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[dojox]
  }
  @scala.inline
  implicit class dojoxOps[Self <: dojox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBidiComplex(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BidiComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnalytics(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analytics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApp(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAtom(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAv(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("av")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalc(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalendar(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharting(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollections(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCss3(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDgauges(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dgauges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDnd(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawing(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDtl(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditor(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmbed(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoding(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnhanced(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhanced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlash(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForm(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFx(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGantt(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gantt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGauges(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gauges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeo(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGesture(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gesture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGfx(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gfx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGfx3d(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gfx3d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrid(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelp(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlight(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIo(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("io")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJq(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJson(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsonPath(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLang(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayout(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMath(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("math")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMdnd(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMobile(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMvc(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mvc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenlayers(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openlayers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRails(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRobot(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("robot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRpc(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rpc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecure(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSketch(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sketch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSocket(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSprintf(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sprintf")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSql(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sql")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTesting(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTiming(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreemap(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treemap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUuid(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidate(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidget(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXml(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xml")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

