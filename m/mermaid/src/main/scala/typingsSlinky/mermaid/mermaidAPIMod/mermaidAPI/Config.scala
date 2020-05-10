package typingsSlinky.mermaid.mermaidAPIMod.mermaidAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  /**
    * **arrowMarkerAbsolute** - This options controls whether or arrow markers in html code will be absolute paths or
    * an anchor, #. This matters if you are using base tag settings.
    * default: false
    */
  var arrowMarkerAbsolute: js.UndefOr[Boolean] = js.native
  var `class`: js.UndefOr[js.Any] = js.native
  /**
    * ### flowchart
    * *The object containing configurations specific for flowcharts*
    */
  var flowchart: js.UndefOr[FlowChartConfig] = js.native
  /**
    * ### gantt
    * The object containing configurations specific for gantt diagrams*
    */
  var gantt: js.UndefOr[GanttConfig] = js.native
  var git: js.UndefOr[js.Any] = js.native
  /**
    * logLevel , decides the amount of logging to be used.
    * default: LogLevel.Fatal
    */
  var logLevel: js.UndefOr[LogLevel] = js.native
  /**
    * securityLevel: disallow/allow potentially dangerous cross-site scripting behavior
    *   the two documented values are "strict" and "loose", i.e. disallow and allow
    *   default: "strict"
    *   If the value is not present, the default behavior is "strict"
    *   Up through version mermaid@8.2.3, if any text value is present in a config but is not "strict", the behavior is "loose".
    *   This should be fixed after that version, i.e. any value other "loose" should be treated as "strict".
    */
  var securityLevel: js.UndefOr[String] = js.native
  /**
    * ###  sequenceDiagram
    * The object containing configurations specific for sequence diagrams
    */
  var sequence: js.UndefOr[SequenceDiagramConfig] = js.native
  /**
    * **startOnLoad** - This options controls whether or mermaid starts when the page loads
    * default: true
    */
  var startOnLoad: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[Theme] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowMarkerAbsolute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowMarkerAbsolute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowMarkerAbsolute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowMarkerAbsolute")(js.undefined)
        ret
    }
    @scala.inline
    def withClass(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(js.undefined)
        ret
    }
    @scala.inline
    def withFlowchart(value: FlowChartConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowchart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlowchart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowchart")(js.undefined)
        ret
    }
    @scala.inline
    def withGantt(value: GanttConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gantt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGantt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gantt")(js.undefined)
        ret
    }
    @scala.inline
    def withGit(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withSequence(value: SequenceDiagramConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(js.undefined)
        ret
    }
    @scala.inline
    def withStartOnLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOnLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: Theme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

