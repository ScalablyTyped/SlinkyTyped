package typingsSlinky.rdflib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fetcherMod {
  
  type BooleanMap = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  
  /** Differs from normal Fetch, has an extended Response type */
  type Fetch = js.Function2[
    /* input */ typingsSlinky.std.RequestInfo, 
    /* init */ js.UndefOr[org.scalajs.dom.experimental.RequestInit], 
    js.Promise[typingsSlinky.rdflib.fetcherMod.ExtendedResponse]
  ]
  
  type FetchCallbacks = org.scalablytyped.runtime.StringDictionary[js.Array[typingsSlinky.rdflib.fetcherMod.UserCallback]]
  
  type FetchQueue = org.scalablytyped.runtime.StringDictionary[js.Promise[typingsSlinky.rdflib.fetcherMod.ExtendedResponse]]
  
  type MediatypesMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.rdflib.anon.Q]
  
  type RequestedMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.rdflib.fetcherMod.StatusValues]
  
  type Result = org.scalajs.dom.experimental.Response
  
  /* Rewritten from type alias, can be one of: 
    - js.UndefOr[scala.Nothing]
    - typingsSlinky.rdflib.rdflibBooleans.`true`
    - typingsSlinky.rdflib.rdflibStrings.done
    - typingsSlinky.rdflib.rdflibNumbers.`401`
    - typingsSlinky.rdflib.rdflibNumbers.`403`
    - typingsSlinky.rdflib.rdflibNumbers.`404`
    - typingsSlinky.rdflib.rdflibStrings.redirected
    - typingsSlinky.rdflib.rdflibStrings.failed
    - typingsSlinky.rdflib.rdflibStrings.parse_error
    - typingsSlinky.rdflib.rdflibStrings.unsupported_protocol
    - typingsSlinky.rdflib.rdflibStrings.timeout
    - / ** Any other HTTP status code * /
  scala.Double
  */
  type StatusValues = js.UndefOr[
    typingsSlinky.rdflib.fetcherMod._StatusValues | (/** Any other HTTP status code */
  scala.Double)
  ]
  
  type TimeOutsMap = org.scalablytyped.runtime.StringDictionary[js.Array[scala.Double]]
  
  type UserCallback = js.Function3[
    /* ok */ scala.Boolean, 
    /* message */ java.lang.String, 
    /* response */ js.UndefOr[js.Any], 
    scala.Unit
  ]
}
