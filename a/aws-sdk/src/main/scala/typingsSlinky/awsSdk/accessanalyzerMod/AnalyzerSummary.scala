package typingsSlinky.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyzerSummary extends js.Object {
  /**
    * The ARN of the analyzer.
    */
  var arn: AnalyzerArn = js.native
  /**
    * A timestamp for the time at which the analyzer was created.
    */
  var createdAt: js.Date = js.native
  /**
    * The resource that was most recently analyzed by the analyzer.
    */
  var lastResourceAnalyzed: js.UndefOr[String] = js.native
  /**
    * The time at which the most recently analyzed resource was analyzed.
    */
  var lastResourceAnalyzedAt: js.UndefOr[js.Date] = js.native
  /**
    * The name of the analyzer.
    */
  var name: Name = js.native
  /**
    * The tags added to the analyzer.
    */
  var tags: js.UndefOr[TagsMap] = js.native
  /**
    * The type of analyzer, which corresponds to the zone of trust chosen for the analyzer.
    */
  var `type`: Type = js.native
}

object AnalyzerSummary {
  @scala.inline
  def apply(arn: AnalyzerArn, createdAt: js.Date, name: Name, `type`: Type): AnalyzerSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzerSummary]
  }
  @scala.inline
  implicit class AnalyzerSummaryOps[Self <: AnalyzerSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: AnalyzerArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastResourceAnalyzed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastResourceAnalyzed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastResourceAnalyzed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastResourceAnalyzed")(js.undefined)
        ret
    }
    @scala.inline
    def withLastResourceAnalyzedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastResourceAnalyzedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastResourceAnalyzedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastResourceAnalyzedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagsMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

