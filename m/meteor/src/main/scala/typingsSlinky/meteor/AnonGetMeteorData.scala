package typingsSlinky.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetMeteorData[TOwnProps, TDataProps] extends js.Object {
  var pure: js.UndefOr[Boolean] = js.native
  def getMeteorData(props: TOwnProps): TDataProps = js.native
}

object AnonGetMeteorData {
  @scala.inline
  def apply[TOwnProps, TDataProps](getMeteorData: TOwnProps => TDataProps): AnonGetMeteorData[TOwnProps, TDataProps] = {
    val __obj = js.Dynamic.literal(getMeteorData = js.Any.fromFunction1(getMeteorData))
    __obj.asInstanceOf[AnonGetMeteorData[TOwnProps, TDataProps]]
  }
  @scala.inline
  implicit class AnonGetMeteorDataOps[Self[townprops, tdataprops] <: AnonGetMeteorData[townprops, tdataprops], TOwnProps, TDataProps] (val x: Self[TOwnProps, TDataProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TOwnProps, TDataProps] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TOwnProps, TDataProps]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TOwnProps, TDataProps]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TOwnProps, TDataProps]) with Other]
    @scala.inline
    def withGetMeteorData(value: TOwnProps => TDataProps): Self[TOwnProps, TDataProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMeteorData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPure(value: Boolean): Self[TOwnProps, TDataProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPure: Self[TOwnProps, TDataProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pure")(js.undefined)
        ret
    }
  }
  
}

