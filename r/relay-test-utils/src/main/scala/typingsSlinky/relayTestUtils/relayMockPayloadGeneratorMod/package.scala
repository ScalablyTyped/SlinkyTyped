package typingsSlinky.relayTestUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object relayMockPayloadGeneratorMod {
  type MockResolver = js.Function2[
    /* context */ typingsSlinky.relayTestUtils.relayMockPayloadGeneratorMod.MockResolverContext, 
    /* generateId */ js.Function0[scala.Double], 
    js.Any
  ]
  type MockResolvers = org.scalablytyped.runtime.StringDictionary[typingsSlinky.relayTestUtils.relayMockPayloadGeneratorMod.MockResolver]
}
