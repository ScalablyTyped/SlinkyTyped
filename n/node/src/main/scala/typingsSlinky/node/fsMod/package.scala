package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fsMod {
  type Mode = scala.Double | java.lang.String
  type NoParamCallback = js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, scala.Unit]
  type OpenMode = scala.Double | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.node.Buffer
    - typingsSlinky.node.urlMod.URL_
  */
  type PathLike = typingsSlinky.node.fsMod._PathLike | java.lang.String
  type WriteFileOptions = typingsSlinky.node.anon.BaseEncodingOptionsmodeMoEncoding | java.lang.String | scala.Null
}
