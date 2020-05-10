package typingsSlinky.reactJsonTree.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONTreeProps extends Props[JSONTreeComponent] {
  var collectionLimit: js.UndefOr[Double] = js.native
  var data: js.Array[_] | js.Object = js.native
  var getItemString: js.UndefOr[
    js.Function4[
      /* type */ String, 
      /* data */ js.Array[_] | js.Object, 
      /* itemType */ String, 
      /* itemString */ String, 
      ReactElement
    ]
  ] = js.native
  var hideRoot: js.UndefOr[Boolean] = js.native
  var invertTheme: js.UndefOr[Boolean] = js.native
  var isCustomNode: js.UndefOr[js.Function0[Boolean]] = js.native
  var keyPath: js.UndefOr[js.Array[String | Double]] = js.native
  var labelRenderer: js.UndefOr[
    js.Function4[
      /* keyPath */ js.Array[String], 
      /* nodeType */ js.UndefOr[String], 
      /* expanded */ js.UndefOr[Boolean], 
      /* expandable */ js.UndefOr[Boolean], 
      ReactElement
    ]
  ] = js.native
  var postprocessValue: js.UndefOr[js.Function1[/* raw */ String, ReactElement]] = js.native
  var shouldExpandNode: js.UndefOr[
    js.Function3[
      /* keyPath */ js.Array[String | Double], 
      /* data */ js.Array[_] | js.Object, 
      /* level */ Double, 
      Boolean
    ]
  ] = js.native
  var sortObjectKeys: js.UndefOr[js.Function | Boolean] = js.native
  var theme: js.UndefOr[js.Object | String] = js.native
  var valueRenderer: js.UndefOr[
    js.Function3[
      /* displayValue */ String | Double, 
      /* rawValue */ js.UndefOr[String | Double | Boolean | Null], 
      /* repeated */ String | Double, 
      ReactElement
    ]
  ] = js.native
}

object JSONTreeProps {
  @scala.inline
  def apply(data: js.Array[_] | js.Object): JSONTreeProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONTreeProps]
  }
  @scala.inline
  implicit class JSONTreePropsOps[Self <: JSONTreeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[_] | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollectionLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemString(
      value: (/* type */ String, /* data */ js.Array[_] | js.Object, /* itemType */ String, /* itemString */ String) => ReactElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemString")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutGetItemString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemString")(js.undefined)
        ret
    }
    @scala.inline
    def withHideRoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withInvertTheme(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvertTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertTheme")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCustomNode(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCustomNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsCustomNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCustomNode")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPath(value: js.Array[String | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPath")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelRenderer(
      value: (/* keyPath */ js.Array[String], /* nodeType */ js.UndefOr[String], /* expanded */ js.UndefOr[Boolean], /* expandable */ js.UndefOr[Boolean]) => ReactElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelRenderer")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutLabelRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withPostprocessValue(value: /* raw */ String => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postprocessValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPostprocessValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postprocessValue")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldExpandNode(
      value: (/* keyPath */ js.Array[String | Double], /* data */ js.Array[_] | js.Object, /* level */ Double) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldExpandNode")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutShouldExpandNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldExpandNode")(js.undefined)
        ret
    }
    @scala.inline
    def withSortObjectKeys(value: js.Function | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortObjectKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortObjectKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortObjectKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: js.Object | String): Self = {
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
    @scala.inline
    def withValueRenderer(
      value: (/* displayValue */ String | Double, /* rawValue */ js.UndefOr[String | Double | Boolean | Null], /* repeated */ String | Double) => ReactElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRenderer")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutValueRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRenderer")(js.undefined)
        ret
    }
  }
  
}

