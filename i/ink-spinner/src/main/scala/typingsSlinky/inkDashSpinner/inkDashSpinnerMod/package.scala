package typingsSlinky.inkDashSpinner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inkDashSpinnerMod {
  import typingsSlinky.chalk.chalkMod.Chalk
  import typingsSlinky.inkDashSpinner.inkDashSpinnerStrings.bgHex
  import typingsSlinky.inkDashSpinner.inkDashSpinnerStrings.bgHsl
  import typingsSlinky.inkDashSpinner.inkDashSpinnerStrings.bgHsv
  import typingsSlinky.inkDashSpinner.inkDashSpinnerStrings.bgHwb
  import typingsSlinky.inkDashSpinner.inkDashSpinnerStrings.bgKeyword
  import typingsSlinky.inkDashSpinner.inkDashSpinnerStrings.bgRgb
  import typingsSlinky.inkDashSpinner.inkDashSpinnerStrings.constructor
  import typingsSlinky.inkDashSpinner.inkDashSpinnerStrings.enabled
  import typingsSlinky.inkDashSpinner.inkDashSpinnerStrings.hex
  import typingsSlinky.inkDashSpinner.inkDashSpinnerStrings.hsl
  import typingsSlinky.inkDashSpinner.inkDashSpinnerStrings.hsv
  import typingsSlinky.inkDashSpinner.inkDashSpinnerStrings.hwb
  import typingsSlinky.inkDashSpinner.inkDashSpinnerStrings.keyword
  import typingsSlinky.inkDashSpinner.inkDashSpinnerStrings.level
  import typingsSlinky.inkDashSpinner.inkDashSpinnerStrings.rgb
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type BooleansPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? boolean}
    */ typingsSlinky.inkDashSpinner.inkDashSpinnerStrings.BooleansPartial with js.Any
  type ChalkColorModels = Pick[Chalk, rgb | hsl | hsv | hwb | bgRgb | bgHsl | bgHsv | bgHwb]
  type ChalkCommons = Omit[Chalk, String | constructor | level | enabled]
  type ChalkKeywordsAndHexes = Pick[Chalk, keyword | hex | bgKeyword | bgHex]
  type ChalkProps = BooleansPartial[ChalkCommons] with StringifyPartial[ChalkKeywordsAndHexes] with TupleOfNumbersPartial[ChalkColorModels]
  // Omit taken from https://www.typescriptlang.org/docs/handbook/release-notes/typescript-2-8.html
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type Spinner = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<SpinnerProps & ChalkProps> */ js.Any
  type StringifyPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string}
    */ typingsSlinky.inkDashSpinner.inkDashSpinnerStrings.StringifyPartial with js.Any
  type TupleOfNumbersPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? [number, number, number]}
    */ typingsSlinky.inkDashSpinner.inkDashSpinnerStrings.TupleOfNumbersPartial with js.Any
}
