package typingsSlinky.ractive.mod

import typingsSlinky.ractive.anon.Optional
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendOpts[T /* <: Ractive[T] */] extends BaseInitOpts[T] {
  /** A list of attributes to be reserved by a component. Any additional attributes are collected into the extra-attributes partial. */
  var attributes: js.UndefOr[js.Array[String] | Optional] = js.native
  /** The css to add to the page when the first instance of this component is rendered. */
  var css: js.UndefOr[String | CssFn] = js.native
  /** Default data to be supplied to any css functions. */
  var cssData: js.UndefOr[ValueMap] = js.native
  /** The id to use when transforming css to be scoped. Defaults to a random guid. */
  var cssId: js.UndefOr[String] = js.native
  /** A function supplying the default data for instances of this component. */
  var data: js.UndefOr[DataFn[T]] = js.native
  /** Whether or not data and plugins can be pulled from parent instances. Defaults to false. */
  var isolated: js.UndefOr[Boolean] = js.native
  /** If true, css selectors will not be scoped using the cssId of this component. */
  var noCssTransform: js.UndefOr[Boolean] = js.native
  /** An array of plugins to apply to the component. */
  var use: js.UndefOr[js.Array[PluginExtend]] = js.native
}

object ExtendOpts {
  @scala.inline
  def apply[T](): ExtendOpts[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendOpts[T]]
  }
  @scala.inline
  implicit class ExtendOptsOps[Self[t] <: ExtendOpts[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAttributes(value: js.Array[String] | Optional): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withCssFunction1(value: /* data */ DataGetFn => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCss(value: String | CssFn): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.undefined)
        ret
    }
    @scala.inline
    def withCssData(value: ValueMap): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssData: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssData")(js.undefined)
        ret
    }
    @scala.inline
    def withCssId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssId: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssId")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: DataFn[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withIsolated(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsolated: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolated")(js.undefined)
        ret
    }
    @scala.inline
    def withNoCssTransform(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCssTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoCssTransform: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCssTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withUse(value: js.Array[PluginExtend]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(js.undefined)
        ret
    }
  }
  
}

