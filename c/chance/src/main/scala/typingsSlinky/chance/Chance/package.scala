package typingsSlinky.chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Chance {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.chance.Anon_All
  import typingsSlinky.chance.Anon_Length

  type MixinDescriptor = StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]
  type NameOptions = FullNameOptions with FirstNameOptions with LastNameOptions with PrefixOptions
  // A more rigorous approach might be to produce
  // the correct options interfaces for each method
  type Options = StringDictionary[js.Any]
  type PrefixOptions = Anon_All with SuffixOptions
  type Seed = Double | String
  type StringOptions = CharacterOptions with Anon_Length
}
