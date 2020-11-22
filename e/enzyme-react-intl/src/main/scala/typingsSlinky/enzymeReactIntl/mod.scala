package typingsSlinky.enzymeReactIntl

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.cheerio.cheerio.Cheerio
import typingsSlinky.enzyme.mod.MountRendererProps
import typingsSlinky.enzyme.mod.ReactWrapper
import typingsSlinky.enzyme.mod.ShallowRendererProps
import typingsSlinky.enzyme.mod.ShallowWrapper
import typingsSlinky.reactIntl.mod.IntlProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("enzyme-react-intl", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getIntl(): IntlProvider = js.native
  
  def getLocale(): String = js.native
  
  def loadTranslation(translationFilePath: String): js.Any = js.native
  
  def loadTranslationObject[T /* <: StringDictionary[String] */](translations: T): T = js.native
  
  def mountWithIntl[P](node: ReactElement): ReactWrapper[P, _, ReactComponentClass[js.Object]] = js.native
  def mountWithIntl[P](node: ReactElement, options: MountRendererProps): ReactWrapper[P, _, ReactComponentClass[js.Object]] = js.native
  @JSName("mountWithIntl")
  def mountWithIntl_C_ComponentObjectObjectWildcardPS[C /* <: ReactComponentClass[js.Object] */, P, S](node: ReactElement): ReactWrapper[P, S, C] = js.native
  @JSName("mountWithIntl")
  def mountWithIntl_C_ComponentObjectObjectWildcardPS[C /* <: ReactComponentClass[js.Object] */, P, S](node: ReactElement, options: MountRendererProps): ReactWrapper[P, S, C] = js.native
  @JSName("mountWithIntl")
  def mountWithIntl_PS[P, S](node: ReactElement): ReactWrapper[P, S, ReactComponentClass[js.Object]] = js.native
  @JSName("mountWithIntl")
  def mountWithIntl_PS[P, S](node: ReactElement, options: MountRendererProps): ReactWrapper[P, S, ReactComponentClass[js.Object]] = js.native
  
  def renderWithIntl[P, S](node: ReactElement): Cheerio = js.native
  def renderWithIntl[P, S](node: ReactElement, options: js.Any): Cheerio = js.native
  
  def setLocale(locale: String): Unit = js.native
  
  def shallowWithIntl[P](node: ReactElement): ShallowWrapper[P, _, ReactComponentClass[js.Object]] = js.native
  def shallowWithIntl[P](node: ReactElement, options: ShallowRendererProps): ShallowWrapper[P, _, ReactComponentClass[js.Object]] = js.native
  @JSName("shallowWithIntl")
  def shallowWithIntl_C_ComponentObjectObjectWildcardPS[C /* <: ReactComponentClass[js.Object] */, P, S](node: ReactElement): ShallowWrapper[P, S, C] = js.native
  @JSName("shallowWithIntl")
  def shallowWithIntl_C_ComponentObjectObjectWildcardPS[C /* <: ReactComponentClass[js.Object] */, P, S](node: ReactElement, options: ShallowRendererProps): ShallowWrapper[P, S, C] = js.native
  @JSName("shallowWithIntl")
  def shallowWithIntl_PS[P, S](node: ReactElement): ShallowWrapper[P, S, ReactComponentClass[js.Object]] = js.native
  @JSName("shallowWithIntl")
  def shallowWithIntl_PS[P, S](node: ReactElement, options: ShallowRendererProps): ShallowWrapper[P, S, ReactComponentClass[js.Object]] = js.native
}
