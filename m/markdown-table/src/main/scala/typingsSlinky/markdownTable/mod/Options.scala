package typingsSlinky.markdownTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * One style for all columns (`string`), or styles for their respective columns (`string[]`).
    * Each style is either `'l'` (left), `'r'` (right), or `'c'` (center).
    * Other values are treated as `''`, which doesn't place the colon in the alignment row but does align left.
    * Only the lowercased first character is used, so `'Right'` is fine.
    */
  var align: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Whether to align the delimiters.
    *
    * By default, they are aligned:
    * ```
    * | Alpha | B     |
    * | ----- | ----- |
    * | C     | Delta |
    * ```
    *
    * Pass `false` to make them staggered:
    * ```
    * | Alpha | B |
    * | - | - |
    * | C | Delta |
    * ```
    *
    * @default true
    */
  var alignDelimiters: js.UndefOr[Boolean] = js.native
  /**
    * Whether to end each row with the delimiter.
    * Note: please don't use this: it could create fragile structures that aren't understandable to some Markdown parsers.
    *
    * When `true`, there are ending delimiters:
    * ```
    * | Alpha | B     |
    * | ----- | ----- |
    * | C     | Delta |
    * ```
    *
    * When `false`, there are no ending delimiters:
    * ```
    * | Alpha | B
    * | ----- | -----
    * | C     | Delta
    * ```
    *
    * @default true
    */
  var delimiterEnd: js.UndefOr[Boolean] = js.native
  /**
    * Whether to begin each row with the delimiter.
    * Note: please don't use this: it could create fragile structures that aren't understandable to some Markdown parsers.
    *
    * When `true`, there are starting delimiters:
    * ```
    * | Alpha | B     |
    * | ----- | ----- |
    * | C     | Delta |
    * ```
    *
    * When `false`, there are no starting delimiters:
    * ```
    * Alpha | B     |
    * ----- | ----- |
    * C     | Delta |
    * ```
    *
    * @default true
    */
  var delimiterStart: js.UndefOr[Boolean] = js.native
  /**
    * Whether to add a space of padding between delimiters and cells.
    *
    * When `true`, there is padding:
    * ```
    * | Alpha | B     |
    * | ----- | ----- |
    * | C     | Delta |
    * ```
    *
    * When `false`, there is no padding:
    * ```
    * |Alpha|B    |
    * |-----|-----|
    * |C    |Delta|
    * ```
    *
    * @default true
    */
  var padding: js.UndefOr[Boolean] = js.native
  /**
    * Method to detect the length of a cell.
    *
    * Full-width characters and ANSI-sequences all mess up delimiter alignment when viewing the Markdown source.
    * To fix this, you have to pass in a `stringLength` option to detect the “visible” length of a cell
    * (note that what is and isn’t visible depends on your editor).
    *
    * Without such a function, the following:
    * ```
    * table([
    *   ['Alpha', 'Bravo'],
    *   ['中文', 'Charlie'],
    *   ['👩‍❤️‍👩', 'Delta']
    * ])
    * ```
    * Yields:
    * ```
    * | Alpha | Bravo |
    * | - | - |
    * | 中文 | Charlie |
    * | 👩‍❤️‍👩 | Delta |
    * ```
    *
    * With [`string-width`]{@link https://github.com/sindresorhus/string-width}:
    * ```
    * import width from 'string-width'
    *
    * table(
    *   [
    *     ['Alpha', 'Bravo'],
    *     ['中文', 'Charlie'],
    *     ['👩‍❤️‍👩', 'Delta']
    *   ],
    *   {stringLength: width}
    * )
    * ```
    * Yields:
    * ```
    * | Alpha | Bravo   |
    * | ----- | ------- |
    * | 中文  | Charlie |
    * | 👩‍❤️‍👩    | Delta   |
    * ```
    * @default s => s.length
    */
  var stringLength: js.UndefOr[js.Function1[/* s */ String, Double]] = js.native
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
    def withAlign(value: String | js.Array[String]): Self = {
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
    def withAlignDelimiters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignDelimiters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignDelimiters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignDelimiters")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiterEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiterEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiterEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiterEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiterStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiterStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiterStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiterStart")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withStringLength(value: /* s */ String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStringLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringLength")(js.undefined)
        ret
    }
  }
  
}

