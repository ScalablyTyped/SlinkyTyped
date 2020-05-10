package typingsSlinky.apolloEngineReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextualizedTypeStats extends js.Object {
  /** ContextualizedTypeStats context */
  var context: js.UndefOr[IStatsContext | Null] = js.native
  /** ContextualizedTypeStats perTypeStat */
  var perTypeStat: js.UndefOr[StringDictionary[ITypeStat] | Null] = js.native
}

object IContextualizedTypeStats {
  @scala.inline
  def apply(): IContextualizedTypeStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContextualizedTypeStats]
  }
  @scala.inline
  implicit class IContextualizedTypeStatsOps[Self <: IContextualizedTypeStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: IStatsContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withContextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(null)
        ret
    }
    @scala.inline
    def withPerTypeStat(value: StringDictionary[ITypeStat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perTypeStat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerTypeStat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perTypeStat")(js.undefined)
        ret
    }
    @scala.inline
    def withPerTypeStatNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perTypeStat")(null)
        ret
    }
  }
  
}

