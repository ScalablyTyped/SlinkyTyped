package typingsSlinky.heftJest

import typingsSlinky.heftJest.heftJestBooleans.`false`
import typingsSlinky.heftJest.heftJestBooleans.`true`
import typingsSlinky.heftJest.mocked.MaybeMocked
import typingsSlinky.heftJest.mocked.MaybeMockedDeep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object mocked {
    
    /**
      * Tests can use the `mocked()` function to access additional properties that
      * Jest adds to a mocked object.
      *
      * @remarks
      *
      * In the example below, `mockClear()` is not part of the type signature for the
      * real `SoundPlayer` class.  It is added by Jest.  The `mocked()` function returns
      * its input object but extends the type signature with these additional members.
      *
      * ```ts
      * jest.mock('./SoundPlayer');
      * import SoundPlayer from './SoundPlayer';
      *
      * // mockClear() is provided by Jest's API:
      * mocked(SoundPlayer).mockClear();
      * ```
      *
      * Heft's API is based on `mocked()` from `ts-jest`, but provided as a global API
      * so you don't need to explicitly import it.  For more information, see the `ts-jest`
      * documentation here:
      *
      * https://kulshekhar.github.io/ts-jest/user/test-helpers
      */
    @JSGlobal("mocked")
    @js.native
    def apply[T](item: T): MaybeMocked[T] = js.native
    @JSGlobal("mocked")
    @js.native
    def apply[T](item: T, deep: `false`): MaybeMocked[T] = js.native
    @JSGlobal("mocked")
    @js.native
    def apply[T](item: T, deep: `true`): MaybeMockedDeep[T] = js.native
  }
}
