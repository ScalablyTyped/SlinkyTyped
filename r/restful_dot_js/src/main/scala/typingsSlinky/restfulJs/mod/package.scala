package typingsSlinky.restfulJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FullRequestInterceptor = js.Function5[
    /* params */ js.Any, 
    /* headers */ typingsSlinky.restfulJs.mod.Headers, 
    /* data */ js.Any, 
    /* method */ java.lang.String, 
    /* url */ java.lang.String, 
    typingsSlinky.restfulJs.mod.FullRequestInterceptorReturnValue
  ]
  type Headers = org.scalablytyped.runtime.StringDictionary[js.Any]
  type RequestInterceptor = js.Function4[
    /* data */ js.Any, 
    /* headers */ typingsSlinky.restfulJs.mod.Headers, 
    /* method */ java.lang.String, 
    /* url */ java.lang.String, 
    js.Any
  ]
  type ResponseInterceptor = js.Function4[
    /* data */ js.Any, 
    /* headers */ typingsSlinky.restfulJs.mod.Headers, 
    /* method */ java.lang.String, 
    /* url */ java.lang.String, 
    typingsSlinky.restfulJs.mod.ResponseInterceptorReturnValue
  ]
}
