package typingsSlinky.deepmerge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var arrayMerge: js.UndefOr[
    js.Function3[
      /* target */ js.Array[_], 
      /* source */ js.Array[_], 
      /* options */ js.UndefOr[this.type], 
      js.Array[_]
    ]
  ] = js.native
  @JSName("clone")
  var clone_FOptions: js.UndefOr[Boolean] = js.native
  var customMerge: js.UndefOr[
    js.Function2[
      /* key */ String, 
      /* options */ js.UndefOr[Options], 
      js.UndefOr[js.Function2[/* x */ _, /* y */ _, _]]
    ]
  ] = js.native
  var isMergeableObject: js.UndefOr[js.Function1[/* value */ js.Object, Boolean]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayMerge(
      value: (/* target */ js.Array[_], /* source */ js.Array[_], /* options */ js.UndefOr[Options]) => js.Array[_]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayMerge")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutArrayMerge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayMerge")(js.undefined)
        ret
    }
    @scala.inline
    def withClone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomMerge(
      value: (/* key */ String, /* options */ js.UndefOr[Options]) => js.UndefOr[js.Function2[/* x */ _, /* y */ _, _]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMerge")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCustomMerge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMerge")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMergeableObject(value: /* value */ js.Object => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMergeableObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsMergeableObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMergeableObject")(js.undefined)
        ret
    }
  }
  
}

