package typingsSlinky.reactRelay.entryPointTypesMod

import typingsSlinky.react.mod._Global_.JSX.LibraryManagedAttributes
import typingsSlinky.reactRelay.reactRelayStrings.entryPoints
import typingsSlinky.reactRelay.reactRelayStrings.extraProps
import typingsSlinky.reactRelay.reactRelayStrings.queries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  entryPoints  :react.react._Global_.JSX.LibraryManagedAttributes<TEntryPointComponent, 'entryPoints'>,   extraProps  :react.react._Global_.JSX.LibraryManagedAttributes<TEntryPointComponent, 'extraProps'>, getComponent (): TEntryPointComponent,   queries  :react.react._Global_.JSX.LibraryManagedAttributes<TEntryPointComponent, 'queries'>}> */
trait PreloadedEntryPoint[TEntryPointComponent] extends js.Object {
  val entryPoints: LibraryManagedAttributes[TEntryPointComponent, typingsSlinky.reactRelay.reactRelayStrings.entryPoints]
  val extraProps: LibraryManagedAttributes[TEntryPointComponent, typingsSlinky.reactRelay.reactRelayStrings.extraProps]
  val getComponent: js.Function0[TEntryPointComponent]
  val queries: LibraryManagedAttributes[TEntryPointComponent, typingsSlinky.reactRelay.reactRelayStrings.queries]
}

object PreloadedEntryPoint {
  @scala.inline
  def apply[TEntryPointComponent](
    entryPoints: LibraryManagedAttributes[TEntryPointComponent, entryPoints],
    extraProps: LibraryManagedAttributes[TEntryPointComponent, extraProps],
    getComponent: () => TEntryPointComponent,
    queries: LibraryManagedAttributes[TEntryPointComponent, queries]
  ): PreloadedEntryPoint[TEntryPointComponent] = {
    val __obj = js.Dynamic.literal(entryPoints = entryPoints.asInstanceOf[js.Any], extraProps = extraProps.asInstanceOf[js.Any], getComponent = js.Any.fromFunction0(getComponent), queries = queries.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PreloadedEntryPoint[TEntryPointComponent]]
  }
}

