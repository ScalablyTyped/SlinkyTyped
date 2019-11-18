package typingsSlinky.antd

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antd.esTypographyMod.TypographyProps
import typingsSlinky.antd.esTypographyParagraphMod.ParagraphProps
import typingsSlinky.antd.esTypographyTextMod.TextProps
import typingsSlinky.antd.esTypographyTitleMod.TitleProps
import typingsSlinky.react.reactMod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es/typography", JSImport.Namespace)
@js.native
object esTypographyMod extends js.Object {
  /* Inlined react.react.FunctionComponent<antd.antd/es/typography/Typography.TypographyProps> & {  Text  :react.react.SFC<antd.antd/es/typography/Text.TextProps>,   Title  :react.react.SFC<antd.antd/es/typography/Title.TitleProps>,   Paragraph  :react.react.SFC<antd.antd/es/typography/Paragraph.ParagraphProps>} */
  @js.native
  trait TypographyProps extends js.Object {
    var Paragraph: ReactComponentClass[ParagraphProps] = js.native
    var Text: ReactComponentClass[TextProps] = js.native
    var Title: ReactComponentClass[TitleProps] = js.native
    var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
    var defaultProps: js.UndefOr[PartialTypographyProps] = js.native
    var displayName: js.UndefOr[String] = js.native
    var propTypes: js.UndefOr[WeakValidationMapTypographyProps] = js.native
    def apply(props: PropsWithChildrenTypographyProps): ReactElement | Null = js.native
    def apply(props: PropsWithChildrenTypographyProps, context: js.Any): ReactElement | Null = js.native
  }
  
  val default: TypographyProps = js.native
}

