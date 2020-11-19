package typingsSlinky.antd

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.PartialTypographyProps
import typingsSlinky.antd.anon.WeakValidationMapTypograp
import typingsSlinky.antd.linkMod.LinkProps
import typingsSlinky.antd.textMod.TextProps
import typingsSlinky.antd.typographyParagraphMod.ParagraphProps
import typingsSlinky.antd.typographyTitleMod.TitleProps
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/typography", JSImport.Namespace)
@js.native
object typographyMod extends js.Object {
  
  val default: TypographyProps = js.native
  
  /* Inlined react.react.FC<antd.antd/lib/typography/Typography.TypographyProps> & {  Text :react.react.FC<antd.antd/lib/typography/Text.TextProps>,   Link :react.react.ForwardRefExoticComponent<antd.antd/lib/typography/Link.LinkProps & react.react.RefAttributes<std.HTMLElement>>,   Title :react.react.FC<antd.antd/lib/typography/Title.TitleProps>,   Paragraph :react.react.FC<antd.antd/lib/typography/Paragraph.ParagraphProps>} */
  @js.native
  trait TypographyProps extends js.Object {
    
    def apply(props: PropsWithChildren[typingsSlinky.antd.typographyTypographyMod.TypographyProps]): ReactElement | Null = js.native
    def apply(
      props: PropsWithChildren[typingsSlinky.antd.typographyTypographyMod.TypographyProps],
      context: js.Any
    ): ReactElement | Null = js.native
    
    var Link: ForwardRefExoticComponent[LinkProps with RefAttributes[HTMLElement]] = js.native
    
    var Paragraph: ReactComponentClass[ParagraphProps] = js.native
    
    var Text: ReactComponentClass[TextProps] = js.native
    
    var Title: ReactComponentClass[TitleProps] = js.native
    
    var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
    
    var defaultProps: js.UndefOr[PartialTypographyProps] = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    var propTypes: js.UndefOr[WeakValidationMapTypograp] = js.native
  }
}
