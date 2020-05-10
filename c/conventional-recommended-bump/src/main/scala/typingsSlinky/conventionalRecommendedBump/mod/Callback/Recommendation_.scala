package typingsSlinky.conventionalRecommendedBump.mod.Callback

import typingsSlinky.conventionalRecommendedBump.mod.Callback.Recommendation.ReleaseType
import typingsSlinky.conventionalRecommendedBump.mod.Options.WhatBump.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `recommendation` is an `object` with a single property, `releaseType`.
  *
  * `releaseType` is a `string`: Possible values: `major`, `minor` and `patch`,
  * or `undefined` if `whatBump` does not return a valid `level` property, or
  * the `level` property is not set by `whatBump`.
  */
@js.native
trait Recommendation_ extends Result {
  /**
    * `releaseType` is a `string`: Possible values: `major`, `minor` and `patch`,
    * or `undefined` if `whatBump` does not return a valid `level` property, or
    * the `level` property is not set by `whatBump`.
    */
  var releaseType: js.UndefOr[ReleaseType] = js.native
}

object Recommendation_ {
  @scala.inline
  def apply(): Recommendation_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recommendation_]
  }
  @scala.inline
  implicit class Recommendation_Ops[Self <: Recommendation_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReleaseType(value: ReleaseType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseType")(js.undefined)
        ret
    }
  }
  
}

