package typingsSlinky.apolloEngineReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQueryStats extends js.Object {
  /** QueryStats perClientName */
  var perClientName: js.UndefOr[StringDictionary[IClientNameStats] | Null] = js.native
  /** QueryStats perType */
  var perType: js.UndefOr[js.Array[ITypeStat] | Null] = js.native
  /** QueryStats perTypeStat */
  var perTypeStat: js.UndefOr[StringDictionary[ITypeStat] | Null] = js.native
  /** QueryStats queryStatsWithContext */
  var queryStatsWithContext: js.UndefOr[js.Array[IContextualizedQueryLatencyStats] | Null] = js.native
  /** QueryStats typeStatsWithContext */
  var typeStatsWithContext: js.UndefOr[js.Array[IContextualizedTypeStats] | Null] = js.native
}

object IQueryStats {
  @scala.inline
  def apply(): IQueryStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQueryStats]
  }
  @scala.inline
  implicit class IQueryStatsOps[Self <: IQueryStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPerClientName(value: StringDictionary[IClientNameStats]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perClientName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerClientName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perClientName")(js.undefined)
        ret
    }
    @scala.inline
    def withPerClientNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perClientName")(null)
        ret
    }
    @scala.inline
    def withPerType(value: js.Array[ITypeStat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perType")(js.undefined)
        ret
    }
    @scala.inline
    def withPerTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perType")(null)
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
    @scala.inline
    def withQueryStatsWithContext(value: js.Array[IContextualizedQueryLatencyStats]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryStatsWithContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryStatsWithContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryStatsWithContext")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryStatsWithContextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryStatsWithContext")(null)
        ret
    }
    @scala.inline
    def withTypeStatsWithContext(value: js.Array[IContextualizedTypeStats]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeStatsWithContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeStatsWithContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeStatsWithContext")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeStatsWithContextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeStatsWithContext")(null)
        ret
    }
  }
  
}

