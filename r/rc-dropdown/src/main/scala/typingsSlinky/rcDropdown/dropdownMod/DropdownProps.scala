package typingsSlinky.rcDropdown.dropdownMod

import org.scalajs.dom.raw.Event
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TriggerProps * / any, 'getPopupContainer' | 'children'> */
@js.native
trait DropdownProps extends js.Object {
  var align: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlignType */ js.Any
  ] = js.native
  var alignPoint: js.UndefOr[Boolean] = js.native
  var animation: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationType */ js.Any
  ] = js.native
  var children: js.UndefOr[js.Any] = js.native
  var getPopupContainer: js.UndefOr[js.Any] = js.native
  var hideAction: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ _
    ]
  ] = js.native
  var minOverlayWidthMatchTrigger: js.UndefOr[Boolean] = js.native
  var onOverlayClick: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  var openClassName: js.UndefOr[String] = js.native
  var overlay: js.UndefOr[js.Function0[ReactElement] | ReactElement] = js.native
  var overlayClassName: js.UndefOr[String] = js.native
  var overlayStyle: js.UndefOr[CSSProperties] = js.native
  var placement: js.UndefOr[String] = js.native
  var placements: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuildInPlacements */ js.Any
  ] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var showAction: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ _
    ]
  ] = js.native
  var transitionName: js.UndefOr[String] = js.native
  var trigger: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ js.Any) | (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ _
    ])
  ] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object DropdownProps {
  @scala.inline
  def apply(): DropdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownProps]
  }
  @scala.inline
  implicit class DropdownPropsOps[Self <: DropdownProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlignType */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignPoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationType */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPopupContainer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopupContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetPopupContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopupContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withHideAction(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ _
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAction")(js.undefined)
        ret
    }
    @scala.inline
    def withMinOverlayWidthMatchTrigger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minOverlayWidthMatchTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinOverlayWidthMatchTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minOverlayWidthMatchTrigger")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOverlayClick(value: /* e */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverlayClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOverlayClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverlayClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVisibleChange(value: /* visible */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVisibleChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnVisibleChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVisibleChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlayFunction0(value: () => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOverlay(value: js.Function0[ReactElement] | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacements(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuildInPlacements */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placements")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAction(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ _
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAction")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionName")(js.undefined)
        ret
    }
    @scala.inline
    def withTrigger(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ js.Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ _
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

