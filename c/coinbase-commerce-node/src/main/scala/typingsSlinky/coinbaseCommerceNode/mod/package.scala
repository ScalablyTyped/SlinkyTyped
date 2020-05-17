package typingsSlinky.coinbaseCommerceNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Node callback
    */
  type Callback[T] = js.Function2[/* error */ js.Any, /* response */ T, scala.Unit]
  /**
    * Create a charge.
    *
    * @link https://commerce.coinbase.com/docs/api/#charge-resource
    */
  type CreateCharge = typingsSlinky.coinbaseCommerceNode.mod.BaseCharge with (typingsSlinky.coinbaseCommerceNode.mod.FixedPrice | typingsSlinky.coinbaseCommerceNode.mod.NoPrice)
  /**
    * Create a checkout.
    *
    * @link https://commerce.coinbase.com/docs/api/#create-a-checkout
    */
  type CreateCheckout = typingsSlinky.coinbaseCommerceNode.mod.BaseCheckout with (typingsSlinky.coinbaseCommerceNode.mod.FixedPrice | typingsSlinky.coinbaseCommerceNode.mod.NoPrice)
  /**
    * Key-value object.
    */
  type KeyVal = org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * Omit a property from the given type.
    */
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  /**
    * Pagination callback.
    */
  type PaginationCallback[T] = js.Function3[
    /* error */ js.Any, 
    /* response */ js.Array[T], 
    /* pagination */ typingsSlinky.coinbaseCommerceNode.mod.Pagination, 
    scala.Unit
  ]
  /**
    * Timestamp string.
    * ISO 8601
    */
  type Timestamp = java.lang.String
  /**
    * Update a checkout resource.
    *
    * @link https://commerce.coinbase.com/docs/api/#update-a-checkout
    */
  type UpdateCheckout = typingsSlinky.coinbaseCommerceNode.mod.Omit[
    typingsSlinky.coinbaseCommerceNode.mod.CreateCheckout, 
    typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.pricing_type
  ]
}
