package typingsSlinky.reactSvg.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ReactType
import typingsSlinky.reactSvg.reactSvgStrings.div
import typingsSlinky.reactSvg.reactSvgStrings.span
import typingsSlinky.tanemSvgInjector.typesMod.BeforeEach
import typingsSlinky.tanemSvgInjector.typesMod.Errback
import typingsSlinky.tanemSvgInjector.typesMod.EvalScripts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseProps
  extends /* key */ StringDictionary[js.Any] {
  
  var afterInjection: js.UndefOr[Errback] = js.native
  
  var beforeInjection: js.UndefOr[BeforeEach] = js.native
  
  var evalScripts: js.UndefOr[EvalScripts] = js.native
  
  var fallback: js.UndefOr[ReactType[_]] = js.native
  
  var loading: js.UndefOr[ReactType[_]] = js.native
  
  var renumerateIRIElements: js.UndefOr[Boolean] = js.native
  
  var src: String = js.native
  
  var useRequestCache: js.UndefOr[Boolean] = js.native
  
  var wrapper: js.UndefOr[div | span] = js.native
}
object BaseProps {
  
  @scala.inline
  def apply(src: String): BaseProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps]
  }
  
  @scala.inline
  implicit class BasePropsOps[Self <: BaseProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterInjection(value: (/* error */ js.Error | Null, /* svg */ js.UndefOr[SVGElement]) => Unit): Self = this.set("afterInjection", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfterInjection: Self = this.set("afterInjection", js.undefined)
    
    @scala.inline
    def setBeforeInjection(value: /* svg */ SVGElement => Unit): Self = this.set("beforeInjection", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeInjection: Self = this.set("beforeInjection", js.undefined)
    
    @scala.inline
    def setEvalScripts(value: EvalScripts): Self = this.set("evalScripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvalScripts: Self = this.set("evalScripts", js.undefined)
    
    @scala.inline
    def setFallbackFunctionComponent(value: ReactComponentClass[_]): Self = this.set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackComponentClass(value: ReactComponentClass[_]): Self = this.set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallback(value: ReactType[_]): Self = this.set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    
    @scala.inline
    def setLoadingFunctionComponent(value: ReactComponentClass[_]): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingComponentClass(value: ReactComponentClass[_]): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoading(value: ReactType[_]): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setRenumerateIRIElements(value: Boolean): Self = this.set("renumerateIRIElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenumerateIRIElements: Self = this.set("renumerateIRIElements", js.undefined)
    
    @scala.inline
    def setUseRequestCache(value: Boolean): Self = this.set("useRequestCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseRequestCache: Self = this.set("useRequestCache", js.undefined)
    
    @scala.inline
    def setWrapper(value: div | span): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
}
