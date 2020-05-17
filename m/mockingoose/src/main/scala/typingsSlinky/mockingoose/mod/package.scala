package typingsSlinky.mockingoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Proxy = typingsSlinky.mockingoose.mod.Target with org.scalablytyped.runtime.StringDictionary[typingsSlinky.mockingoose.mod.Mock] with (js.Function1[
    /* model */ java.lang.String | (typingsSlinky.mongoose.mod.Model_[_, js.Object]), 
    typingsSlinky.mockingoose.mod.Mock
  ])
  type ReturnFunction = js.Function1[
    /* param */ typingsSlinky.mongoose.mod.Query[js.Any] | typingsSlinky.mongoose.mod.Aggregate[js.Any], 
    js.Object
  ]
}
