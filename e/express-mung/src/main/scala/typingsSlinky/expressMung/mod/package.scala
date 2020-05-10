package typingsSlinky.expressMung

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Transform = js.Function3[
    /* body */ js.Object, 
    /* request */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* response */ typingsSlinky.express.mod.Response_[js.Any], 
    js.Any
  ]
  type TransformAsync = js.Function3[
    /* body */ js.Object, 
    /* request */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* response */ typingsSlinky.express.mod.Response_[js.Any], 
    js.Thenable[js.Any]
  ]
  type TransformChunk = js.Function4[
    /* chunk */ java.lang.String | typingsSlinky.node.Buffer, 
    /* encoding */ java.lang.String | scala.Null, 
    /* request */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* response */ typingsSlinky.express.mod.Response_[js.Any], 
    java.lang.String | typingsSlinky.node.Buffer
  ]
  type TransformHeader = js.Function2[
    /* request */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* response */ typingsSlinky.express.mod.Response_[js.Any], 
    js.Any
  ]
  type TransformHeaderAsync = js.Function2[
    /* request */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* response */ typingsSlinky.express.mod.Response_[js.Any], 
    js.Thenable[js.Any]
  ]
}
