package typingsSlinky.apolloLink

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type NextLink = js.Function1[
    /* operation */ typingsSlinky.apolloLink.typesMod.Operation, 
    typingsSlinky.zenObservableTs.zenObservableMod.Observable[
      typingsSlinky.apolloLink.typesMod.FetchResult[
        org.scalablytyped.runtime.StringDictionary[js.Any], 
        typingsSlinky.std.Record[java.lang.String, js.Any], 
        typingsSlinky.std.Record[java.lang.String, js.Any]
      ]
    ]
  ]
  type RequestHandler = js.Function2[
    /* operation */ typingsSlinky.apolloLink.typesMod.Operation, 
    /* forward */ typingsSlinky.apolloLink.typesMod.NextLink, 
    (typingsSlinky.zenObservableTs.zenObservableMod.Observable[
      typingsSlinky.apolloLink.typesMod.FetchResult[
        org.scalablytyped.runtime.StringDictionary[js.Any], 
        typingsSlinky.std.Record[java.lang.String, js.Any], 
        typingsSlinky.std.Record[java.lang.String, js.Any]
      ]
    ]) | scala.Null
  ]
}
