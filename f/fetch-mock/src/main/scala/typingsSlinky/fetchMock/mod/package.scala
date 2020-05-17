package typingsSlinky.fetchMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Mock matcher function
    */
  type MockMatcherFunction = js.Function2[
    /* url */ java.lang.String, 
    /* opts */ typingsSlinky.fetchMock.mod.MockRequest, 
    scala.Boolean
  ]
  /**
    * Mock response function
    */
  type MockResponseFunction = js.Function2[
    /* url */ java.lang.String, 
    /* opts */ typingsSlinky.fetchMock.mod.MockRequest, 
    typingsSlinky.fetchMock.mod.MockResponse
  ]
}
