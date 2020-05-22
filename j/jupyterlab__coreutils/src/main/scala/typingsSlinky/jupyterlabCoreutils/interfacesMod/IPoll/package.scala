package typingsSlinky.jupyterlabCoreutils.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object IPoll {
  /**
    * The phase of the poll when the current tick was scheduled.
    *
    * @typeparam T - A type for any additional tick phases a poll supports.
    */
  /* Rewritten from type alias, can be one of: 
    - T
    - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.constructed
    - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.disposed
    - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.reconnected
    - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.refreshed
    - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.rejected
    - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.resolved
    - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.standby
    - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.started
    - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.stopped
  */
  type Phase[T /* <: java.lang.String */] = typingsSlinky.jupyterlabCoreutils.interfacesMod.IPoll._Phase[T] | T
}
