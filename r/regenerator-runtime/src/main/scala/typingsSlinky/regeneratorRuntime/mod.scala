package typingsSlinky.regeneratorRuntime

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.regeneratorRuntime.anon.Iterator
import typingsSlinky.regeneratorRuntime.anon.ReadonlyCompletionRecord
import typingsSlinky.regeneratorRuntime.anon.`0`
import typingsSlinky.regeneratorRuntime.anon.readonlytryLocrootOmitTry
import typingsSlinky.regeneratorRuntime.regeneratorRuntimeStrings.`return`
import typingsSlinky.regeneratorRuntime.regeneratorRuntimeStrings.`throw`
import typingsSlinky.regeneratorRuntime.regeneratorRuntimeStrings.break
import typingsSlinky.regeneratorRuntime.regeneratorRuntimeStrings.continue
import typingsSlinky.regeneratorRuntime.regeneratorRuntimeStrings.end
import typingsSlinky.regeneratorRuntime.regeneratorRuntimeStrings.next
import typingsSlinky.std.ArrayLike
import typingsSlinky.std.AsyncGenerator
import typingsSlinky.std.Exclude
import typingsSlinky.std.Generator
import typingsSlinky.std.GeneratorFunction
import typingsSlinky.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("regenerator-runtime", "AsyncIterator")
  @js.native
  class AsyncIterator[TYield, TReturn, TNext] protected () extends AsyncGenerator[TYield, TReturn, TNext] {
    def this(
      generator: Generator[
            TYield | js.Thenable[TYield] | awrap[_], 
            TReturn | js.Thenable[TReturn] | awrap[_], 
            _
          ],
      PromiseImpl: ResolvablePromiseConstructorLike
    ) = this()
    
    @JSName("return")
    def return_MAsyncIterator(value: TReturn): js.Promise[IteratorResult[TYield, TReturn]] = js.native
    @JSName("return")
    def return_MAsyncIterator(value: js.Thenable[TReturn]): js.Promise[IteratorResult[TYield, TReturn]] = js.native
    
    @JSName("throw")
    def throw_MAsyncIterator(e: js.Any): js.Promise[IteratorResult[TYield, TReturn]] = js.native
  }
  
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TReturn](innerFn: InnerFunction[T, _, TReturn, _]): js.Promise[TReturn] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TReturn](
    innerFn: InnerFunction[T, _, TReturn, _],
    // tslint:disable-next-line: ban-types
  outerFn: js.UndefOr[scala.Nothing],
    self: T
  ): js.Promise[TReturn] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TReturn](
    innerFn: InnerFunction[T, _, TReturn, _],
    // tslint:disable-next-line: ban-types
  outerFn: js.UndefOr[scala.Nothing],
    self: T,
    tryLocsList: js.UndefOr[scala.Nothing],
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[TReturn] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TReturn](
    innerFn: InnerFunction[T, _, TReturn, _],
    // tslint:disable-next-line: ban-types
  outerFn: js.UndefOr[scala.Nothing],
    self: T,
    tryLocsList: TryLocationsList
  ): js.Promise[TReturn] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TReturn](
    innerFn: InnerFunction[T, _, TReturn, _],
    // tslint:disable-next-line: ban-types
  outerFn: js.UndefOr[scala.Nothing],
    self: T,
    tryLocsList: TryLocationsList,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[TReturn] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TReturn](
    innerFn: InnerFunction[T, _, TReturn, _],
    // tslint:disable-next-line: ban-types
  outerFn: js.UndefOr[scala.Nothing],
    self: js.UndefOr[scala.Nothing],
    tryLocsList: js.UndefOr[scala.Nothing],
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[TReturn] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TReturn](
    innerFn: InnerFunction[T, _, TReturn, _],
    // tslint:disable-next-line: ban-types
  outerFn: js.UndefOr[scala.Nothing],
    self: js.UndefOr[scala.Nothing],
    tryLocsList: TryLocationsList
  ): js.Promise[TReturn] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TReturn](
    innerFn: InnerFunction[T, _, TReturn, _],
    // tslint:disable-next-line: ban-types
  outerFn: js.UndefOr[scala.Nothing],
    self: js.UndefOr[scala.Nothing],
    tryLocsList: TryLocationsList,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[TReturn] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TReturn](
    innerFn: InnerFunction[T, _, TReturn, _],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function
  ): js.Promise[TReturn] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TReturn](
    innerFn: InnerFunction[T, _, TReturn, _],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: T
  ): js.Promise[TReturn] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TReturn](
    innerFn: InnerFunction[T, _, TReturn, _],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: T,
    tryLocsList: js.UndefOr[scala.Nothing],
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[TReturn] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TReturn](
    innerFn: InnerFunction[T, _, TReturn, _],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: T,
    tryLocsList: TryLocationsList
  ): js.Promise[TReturn] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TReturn](
    innerFn: InnerFunction[T, _, TReturn, _],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: T,
    tryLocsList: TryLocationsList,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[TReturn] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TReturn](
    innerFn: InnerFunction[T, _, TReturn, _],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: js.UndefOr[scala.Nothing],
    tryLocsList: js.UndefOr[scala.Nothing],
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[TReturn] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TReturn](
    innerFn: InnerFunction[T, _, TReturn, _],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: js.UndefOr[scala.Nothing],
    tryLocsList: TryLocationsList
  ): js.Promise[TReturn] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TReturn](
    innerFn: InnerFunction[T, _, TReturn, _],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: js.UndefOr[scala.Nothing],
    tryLocsList: TryLocationsList,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[TReturn] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TReturn](
    innerFn: InnerFunction[T, _, TReturn, _],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: T
  ): js.Promise[TReturn] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TReturn](
    innerFn: InnerFunction[T, _, TReturn, _],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: T,
    tryLocsList: js.UndefOr[scala.Nothing],
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[TReturn] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TReturn](
    innerFn: InnerFunction[T, _, TReturn, _],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: T,
    tryLocsList: TryLocationsList
  ): js.Promise[TReturn] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TReturn](
    innerFn: InnerFunction[T, _, TReturn, _],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: T,
    tryLocsList: TryLocationsList,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[TReturn] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TReturn](
    innerFn: InnerFunction[T, _, TReturn, _],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: js.UndefOr[scala.Nothing],
    tryLocsList: js.UndefOr[scala.Nothing],
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[TReturn] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TReturn](
    innerFn: InnerFunction[T, _, TReturn, _],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: js.UndefOr[scala.Nothing],
    tryLocsList: TryLocationsList
  ): js.Promise[TReturn] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TReturn](
    innerFn: InnerFunction[T, _, TReturn, _],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: js.UndefOr[scala.Nothing],
    tryLocsList: TryLocationsList,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[TReturn] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TYield, TReturn](innerFn: InnerFunction[T, TYield, TReturn, _], outerFn: GeneratorFunction): AsyncIterator[Exclude[TYield, awrap[_]], Exclude[TReturn, awrap[_]], _] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TYield, TReturn](innerFn: InnerFunction[T, TYield, TReturn, _], outerFn: GeneratorFunction, self: T): AsyncIterator[Exclude[TYield, awrap[_]], Exclude[TReturn, awrap[_]], _] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TYield, TReturn](
    innerFn: InnerFunction[T, TYield, TReturn, _],
    outerFn: GeneratorFunction,
    self: T,
    tryLocsList: js.UndefOr[scala.Nothing],
    PromiseImpl: ResolvablePromiseConstructorLike
  ): AsyncIterator[Exclude[TYield, awrap[_]], Exclude[TReturn, awrap[_]], _] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TYield, TReturn](
    innerFn: InnerFunction[T, TYield, TReturn, _],
    outerFn: GeneratorFunction,
    self: T,
    tryLocsList: TryLocationsList
  ): AsyncIterator[Exclude[TYield, awrap[_]], Exclude[TReturn, awrap[_]], _] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TYield, TReturn](
    innerFn: InnerFunction[T, TYield, TReturn, _],
    outerFn: GeneratorFunction,
    self: T,
    tryLocsList: TryLocationsList,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): AsyncIterator[Exclude[TYield, awrap[_]], Exclude[TReturn, awrap[_]], _] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TYield, TReturn](
    innerFn: InnerFunction[T, TYield, TReturn, _],
    outerFn: GeneratorFunction,
    self: js.UndefOr[scala.Nothing],
    tryLocsList: js.UndefOr[scala.Nothing],
    PromiseImpl: ResolvablePromiseConstructorLike
  ): AsyncIterator[Exclude[TYield, awrap[_]], Exclude[TReturn, awrap[_]], _] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TYield, TReturn](
    innerFn: InnerFunction[T, TYield, TReturn, _],
    outerFn: GeneratorFunction,
    self: js.UndefOr[scala.Nothing],
    tryLocsList: TryLocationsList
  ): AsyncIterator[Exclude[TYield, awrap[_]], Exclude[TReturn, awrap[_]], _] = js.native
  @JSImport("regenerator-runtime", "async")
  @js.native
  def async[T, TYield, TReturn](
    innerFn: InnerFunction[T, TYield, TReturn, _],
    outerFn: GeneratorFunction,
    self: js.UndefOr[scala.Nothing],
    tryLocsList: TryLocationsList,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): AsyncIterator[Exclude[TYield, awrap[_]], Exclude[TReturn, awrap[_]], _] = js.native
  
  @JSImport("regenerator-runtime", "awrap")
  @js.native
  class awrap[V] protected () extends StObject {
    def this(arg: V) = this()
    
    val __await: V = js.native
    
    // Used to tell TypeScript that this class is to be treated as a nominal type:
    val `private`: js.Any = js.native
  }
  @JSImport("regenerator-runtime", "awrap")
  @js.native
  def awrap[V](arg: V): awrap[V] = js.native
  
  object global {
    
    /* was `typeof imported_regenerator-runtime` */
    object regeneratorRuntime {
      
      @JSGlobal("regeneratorRuntime.AsyncIterator")
      @js.native
      class AsyncIterator[TYield, TReturn, TNext] protected ()
        extends typingsSlinky.regeneratorRuntime.mod.AsyncIterator[TYield, TReturn, TNext] {
        def this(
          generator: Generator[
                    TYield | js.Thenable[TYield] | typingsSlinky.regeneratorRuntime.mod.awrap[_], 
                    TReturn | js.Thenable[TReturn] | typingsSlinky.regeneratorRuntime.mod.awrap[_], 
                    _
                  ],
          PromiseImpl: ResolvablePromiseConstructorLike
        ) = this()
      }
      
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TReturn](innerFn: InnerFunction[T, _, TReturn, _]): js.Promise[TReturn] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TReturn](
        innerFn: InnerFunction[T, _, TReturn, _],
        // tslint:disable-next-line: ban-types
      outerFn: js.UndefOr[scala.Nothing],
        self: T
      ): js.Promise[TReturn] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TReturn](
        innerFn: InnerFunction[T, _, TReturn, _],
        // tslint:disable-next-line: ban-types
      outerFn: js.UndefOr[scala.Nothing],
        self: T,
        tryLocsList: js.UndefOr[scala.Nothing],
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[TReturn] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TReturn](
        innerFn: InnerFunction[T, _, TReturn, _],
        // tslint:disable-next-line: ban-types
      outerFn: js.UndefOr[scala.Nothing],
        self: T,
        tryLocsList: TryLocationsList
      ): js.Promise[TReturn] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TReturn](
        innerFn: InnerFunction[T, _, TReturn, _],
        // tslint:disable-next-line: ban-types
      outerFn: js.UndefOr[scala.Nothing],
        self: T,
        tryLocsList: TryLocationsList,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[TReturn] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TReturn](
        innerFn: InnerFunction[T, _, TReturn, _],
        // tslint:disable-next-line: ban-types
      outerFn: js.UndefOr[scala.Nothing],
        self: js.UndefOr[scala.Nothing],
        tryLocsList: js.UndefOr[scala.Nothing],
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[TReturn] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TReturn](
        innerFn: InnerFunction[T, _, TReturn, _],
        // tslint:disable-next-line: ban-types
      outerFn: js.UndefOr[scala.Nothing],
        self: js.UndefOr[scala.Nothing],
        tryLocsList: TryLocationsList
      ): js.Promise[TReturn] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TReturn](
        innerFn: InnerFunction[T, _, TReturn, _],
        // tslint:disable-next-line: ban-types
      outerFn: js.UndefOr[scala.Nothing],
        self: js.UndefOr[scala.Nothing],
        tryLocsList: TryLocationsList,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[TReturn] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TReturn](
        innerFn: InnerFunction[T, _, TReturn, _],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function
      ): js.Promise[TReturn] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TReturn](
        innerFn: InnerFunction[T, _, TReturn, _],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: T
      ): js.Promise[TReturn] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TReturn](
        innerFn: InnerFunction[T, _, TReturn, _],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: T,
        tryLocsList: js.UndefOr[scala.Nothing],
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[TReturn] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TReturn](
        innerFn: InnerFunction[T, _, TReturn, _],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: T,
        tryLocsList: TryLocationsList
      ): js.Promise[TReturn] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TReturn](
        innerFn: InnerFunction[T, _, TReturn, _],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: T,
        tryLocsList: TryLocationsList,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[TReturn] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TReturn](
        innerFn: InnerFunction[T, _, TReturn, _],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: js.UndefOr[scala.Nothing],
        tryLocsList: js.UndefOr[scala.Nothing],
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[TReturn] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TReturn](
        innerFn: InnerFunction[T, _, TReturn, _],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: js.UndefOr[scala.Nothing],
        tryLocsList: TryLocationsList
      ): js.Promise[TReturn] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TReturn](
        innerFn: InnerFunction[T, _, TReturn, _],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: js.UndefOr[scala.Nothing],
        tryLocsList: TryLocationsList,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[TReturn] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TReturn](
        innerFn: InnerFunction[T, _, TReturn, _],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: T
      ): js.Promise[TReturn] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TReturn](
        innerFn: InnerFunction[T, _, TReturn, _],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: T,
        tryLocsList: js.UndefOr[scala.Nothing],
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[TReturn] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TReturn](
        innerFn: InnerFunction[T, _, TReturn, _],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: T,
        tryLocsList: TryLocationsList
      ): js.Promise[TReturn] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TReturn](
        innerFn: InnerFunction[T, _, TReturn, _],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: T,
        tryLocsList: TryLocationsList,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[TReturn] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TReturn](
        innerFn: InnerFunction[T, _, TReturn, _],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: js.UndefOr[scala.Nothing],
        tryLocsList: js.UndefOr[scala.Nothing],
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[TReturn] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TReturn](
        innerFn: InnerFunction[T, _, TReturn, _],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: js.UndefOr[scala.Nothing],
        tryLocsList: TryLocationsList
      ): js.Promise[TReturn] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TReturn](
        innerFn: InnerFunction[T, _, TReturn, _],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: js.UndefOr[scala.Nothing],
        tryLocsList: TryLocationsList,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[TReturn] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TYield, TReturn](innerFn: InnerFunction[T, TYield, TReturn, _], outerFn: GeneratorFunction): typingsSlinky.regeneratorRuntime.mod.AsyncIterator[
            Exclude[TYield, typingsSlinky.regeneratorRuntime.mod.awrap[_]], 
            Exclude[TReturn, typingsSlinky.regeneratorRuntime.mod.awrap[_]], 
            _
          ] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TYield, TReturn](innerFn: InnerFunction[T, TYield, TReturn, _], outerFn: GeneratorFunction, self: T): typingsSlinky.regeneratorRuntime.mod.AsyncIterator[
            Exclude[TYield, typingsSlinky.regeneratorRuntime.mod.awrap[_]], 
            Exclude[TReturn, typingsSlinky.regeneratorRuntime.mod.awrap[_]], 
            _
          ] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TYield, TReturn](
        innerFn: InnerFunction[T, TYield, TReturn, _],
        outerFn: GeneratorFunction,
        self: T,
        tryLocsList: js.UndefOr[scala.Nothing],
        PromiseImpl: ResolvablePromiseConstructorLike
      ): typingsSlinky.regeneratorRuntime.mod.AsyncIterator[
            Exclude[TYield, typingsSlinky.regeneratorRuntime.mod.awrap[_]], 
            Exclude[TReturn, typingsSlinky.regeneratorRuntime.mod.awrap[_]], 
            _
          ] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TYield, TReturn](
        innerFn: InnerFunction[T, TYield, TReturn, _],
        outerFn: GeneratorFunction,
        self: T,
        tryLocsList: TryLocationsList
      ): typingsSlinky.regeneratorRuntime.mod.AsyncIterator[
            Exclude[TYield, typingsSlinky.regeneratorRuntime.mod.awrap[_]], 
            Exclude[TReturn, typingsSlinky.regeneratorRuntime.mod.awrap[_]], 
            _
          ] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TYield, TReturn](
        innerFn: InnerFunction[T, TYield, TReturn, _],
        outerFn: GeneratorFunction,
        self: T,
        tryLocsList: TryLocationsList,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): typingsSlinky.regeneratorRuntime.mod.AsyncIterator[
            Exclude[TYield, typingsSlinky.regeneratorRuntime.mod.awrap[_]], 
            Exclude[TReturn, typingsSlinky.regeneratorRuntime.mod.awrap[_]], 
            _
          ] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TYield, TReturn](
        innerFn: InnerFunction[T, TYield, TReturn, _],
        outerFn: GeneratorFunction,
        self: js.UndefOr[scala.Nothing],
        tryLocsList: js.UndefOr[scala.Nothing],
        PromiseImpl: ResolvablePromiseConstructorLike
      ): typingsSlinky.regeneratorRuntime.mod.AsyncIterator[
            Exclude[TYield, typingsSlinky.regeneratorRuntime.mod.awrap[_]], 
            Exclude[TReturn, typingsSlinky.regeneratorRuntime.mod.awrap[_]], 
            _
          ] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TYield, TReturn](
        innerFn: InnerFunction[T, TYield, TReturn, _],
        outerFn: GeneratorFunction,
        self: js.UndefOr[scala.Nothing],
        tryLocsList: TryLocationsList
      ): typingsSlinky.regeneratorRuntime.mod.AsyncIterator[
            Exclude[TYield, typingsSlinky.regeneratorRuntime.mod.awrap[_]], 
            Exclude[TReturn, typingsSlinky.regeneratorRuntime.mod.awrap[_]], 
            _
          ] = js.native
      @JSGlobal("regeneratorRuntime.async")
      @js.native
      def async[T, TYield, TReturn](
        innerFn: InnerFunction[T, TYield, TReturn, _],
        outerFn: GeneratorFunction,
        self: js.UndefOr[scala.Nothing],
        tryLocsList: TryLocationsList,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): typingsSlinky.regeneratorRuntime.mod.AsyncIterator[
            Exclude[TYield, typingsSlinky.regeneratorRuntime.mod.awrap[_]], 
            Exclude[TReturn, typingsSlinky.regeneratorRuntime.mod.awrap[_]], 
            _
          ] = js.native
      
      @JSGlobal("regeneratorRuntime.awrap")
      @js.native
      class awrap[V] protected ()
        extends typingsSlinky.regeneratorRuntime.mod.awrap[V] {
        def this(arg: V) = this()
      }
      @JSGlobal("regeneratorRuntime.awrap")
      @js.native
      def awrap[V](arg: V): typingsSlinky.regeneratorRuntime.mod.awrap[V] = js.native
      
      @JSGlobal("regeneratorRuntime.isGeneratorFunction")
      @js.native
      def isGeneratorFunction(func: js.Any): /* is std.GeneratorFunction */ Boolean = js.native
      
      @JSGlobal("regeneratorRuntime.keys")
      @js.native
      def keys(`object`: js.Object): js.Function0[IteratorResult[String, js.UndefOr[scala.Nothing]]] = js.native
      
      @JSGlobal("regeneratorRuntime.mark")
      @js.native
      def mark[F /* <: js.Function */](genFun: F): F with GeneratorFunction = js.native
      
      @JSGlobal("regeneratorRuntime.values")
      @js.native
      def values[T](iterableOrArrayLike: js.Iterable[T]): js.Iterator[T] = js.native
      @JSGlobal("regeneratorRuntime.values")
      @js.native
      def values[T](iterableOrArrayLike: ArrayLike[T]): js.Iterator[T] = js.native
      @JSGlobal("regeneratorRuntime.values")
      @js.native
      def values[I /* <: js.Iterator[_] */](iterable: Iterator[I]): I = js.native
      
      @JSGlobal("regeneratorRuntime.wrap")
      @js.native
      def wrap[T, TYield, TReturn, TNext](innerFn: InnerFunction[T, TYield, TReturn, TNext]): Generator[TYield, TReturn, TNext] = js.native
      @JSGlobal("regeneratorRuntime.wrap")
      @js.native
      def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: js.UndefOr[scala.Nothing],
        self: T
      ): Generator[TYield, TReturn, TNext] = js.native
      @JSGlobal("regeneratorRuntime.wrap")
      @js.native
      def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: js.UndefOr[scala.Nothing],
        self: T,
        tryLocsList: TryLocationsList
      ): Generator[TYield, TReturn, TNext] = js.native
      @JSGlobal("regeneratorRuntime.wrap")
      @js.native
      def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: js.UndefOr[scala.Nothing],
        self: js.UndefOr[scala.Nothing],
        tryLocsList: TryLocationsList
      ): Generator[TYield, TReturn, TNext] = js.native
      @JSGlobal("regeneratorRuntime.wrap")
      @js.native
      def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function
      ): Generator[TYield, TReturn, TNext] = js.native
      @JSGlobal("regeneratorRuntime.wrap")
      @js.native
      def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: T
      ): Generator[TYield, TReturn, TNext] = js.native
      @JSGlobal("regeneratorRuntime.wrap")
      @js.native
      def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: T,
        tryLocsList: TryLocationsList
      ): Generator[TYield, TReturn, TNext] = js.native
      @JSGlobal("regeneratorRuntime.wrap")
      @js.native
      def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: js.UndefOr[scala.Nothing],
        tryLocsList: TryLocationsList
      ): Generator[TYield, TReturn, TNext] = js.native
      @JSGlobal("regeneratorRuntime.wrap")
      @js.native
      def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: T
      ): Generator[TYield, TReturn, TNext] = js.native
      @JSGlobal("regeneratorRuntime.wrap")
      @js.native
      def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: T,
        tryLocsList: TryLocationsList
      ): Generator[TYield, TReturn, TNext] = js.native
      @JSGlobal("regeneratorRuntime.wrap")
      @js.native
      def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: js.UndefOr[scala.Nothing],
        tryLocsList: TryLocationsList
      ): Generator[TYield, TReturn, TNext] = js.native
    }
  }
  
  @JSImport("regenerator-runtime", "isGeneratorFunction")
  @js.native
  def isGeneratorFunction(func: js.Any): /* is std.GeneratorFunction */ Boolean = js.native
  
  @JSImport("regenerator-runtime", "keys")
  @js.native
  def keys(`object`: js.Object): js.Function0[IteratorResult[String, js.UndefOr[scala.Nothing]]] = js.native
  
  @JSImport("regenerator-runtime", "mark")
  @js.native
  def mark[F /* <: js.Function */](genFun: F): F with GeneratorFunction = js.native
  
  @JSImport("regenerator-runtime", "values")
  @js.native
  def values[T](iterableOrArrayLike: js.Iterable[T]): js.Iterator[T] = js.native
  @JSImport("regenerator-runtime", "values")
  @js.native
  def values[T](iterableOrArrayLike: ArrayLike[T]): js.Iterator[T] = js.native
  @JSImport("regenerator-runtime", "values")
  @js.native
  def values[I /* <: js.Iterator[_] */](iterable: Iterator[I]): I = js.native
  
  @JSImport("regenerator-runtime", "wrap")
  @js.native
  def wrap[T, TYield, TReturn, TNext](innerFn: InnerFunction[T, TYield, TReturn, TNext]): Generator[TYield, TReturn, TNext] = js.native
  @JSImport("regenerator-runtime", "wrap")
  @js.native
  def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: js.UndefOr[scala.Nothing],
    self: T
  ): Generator[TYield, TReturn, TNext] = js.native
  @JSImport("regenerator-runtime", "wrap")
  @js.native
  def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: js.UndefOr[scala.Nothing],
    self: T,
    tryLocsList: TryLocationsList
  ): Generator[TYield, TReturn, TNext] = js.native
  @JSImport("regenerator-runtime", "wrap")
  @js.native
  def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: js.UndefOr[scala.Nothing],
    self: js.UndefOr[scala.Nothing],
    tryLocsList: TryLocationsList
  ): Generator[TYield, TReturn, TNext] = js.native
  @JSImport("regenerator-runtime", "wrap")
  @js.native
  def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function
  ): Generator[TYield, TReturn, TNext] = js.native
  @JSImport("regenerator-runtime", "wrap")
  @js.native
  def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: T
  ): Generator[TYield, TReturn, TNext] = js.native
  @JSImport("regenerator-runtime", "wrap")
  @js.native
  def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: T,
    tryLocsList: TryLocationsList
  ): Generator[TYield, TReturn, TNext] = js.native
  @JSImport("regenerator-runtime", "wrap")
  @js.native
  def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: js.UndefOr[scala.Nothing],
    tryLocsList: TryLocationsList
  ): Generator[TYield, TReturn, TNext] = js.native
  @JSImport("regenerator-runtime", "wrap")
  @js.native
  def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: T
  ): Generator[TYield, TReturn, TNext] = js.native
  @JSImport("regenerator-runtime", "wrap")
  @js.native
  def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: T,
    tryLocsList: TryLocationsList
  ): Generator[TYield, TReturn, TNext] = js.native
  @JSImport("regenerator-runtime", "wrap")
  @js.native
  def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: js.UndefOr[scala.Nothing],
    tryLocsList: TryLocationsList
  ): Generator[TYield, TReturn, TNext] = js.native
  
  @js.native
  trait CompletionRecord extends StObject {
    
    var arg: js.Any = js.native
    
    var `type`: CompletionType = js.native
  }
  object CompletionRecord {
    
    @scala.inline
    def apply(arg: js.Any, `type`: CompletionType): CompletionRecord = {
      val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompletionRecord]
    }
    
    @scala.inline
    implicit class CompletionRecordMutableBuilder[Self <: CompletionRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArg(value: js.Any): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: CompletionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.regeneratorRuntime.regeneratorRuntimeStrings.normal
    - typingsSlinky.regeneratorRuntime.regeneratorRuntimeStrings.`return`
    - typingsSlinky.regeneratorRuntime.regeneratorRuntimeStrings.`throw`
    - typingsSlinky.regeneratorRuntime.regeneratorRuntimeStrings.break
    - typingsSlinky.regeneratorRuntime.regeneratorRuntimeStrings.continue
  */
  trait CompletionType extends StObject
  object CompletionType {
    
    @scala.inline
    def break: typingsSlinky.regeneratorRuntime.regeneratorRuntimeStrings.break = "break".asInstanceOf[typingsSlinky.regeneratorRuntime.regeneratorRuntimeStrings.break]
    
    @scala.inline
    def continue: typingsSlinky.regeneratorRuntime.regeneratorRuntimeStrings.continue = "continue".asInstanceOf[typingsSlinky.regeneratorRuntime.regeneratorRuntimeStrings.continue]
    
    @scala.inline
    def normal: typingsSlinky.regeneratorRuntime.regeneratorRuntimeStrings.normal = "normal".asInstanceOf[typingsSlinky.regeneratorRuntime.regeneratorRuntimeStrings.normal]
    
    @scala.inline
    def `return`: typingsSlinky.regeneratorRuntime.regeneratorRuntimeStrings.`return` = "return".asInstanceOf[typingsSlinky.regeneratorRuntime.regeneratorRuntimeStrings.`return`]
    
    @scala.inline
    def `throw`: typingsSlinky.regeneratorRuntime.regeneratorRuntimeStrings.`throw` = "throw".asInstanceOf[typingsSlinky.regeneratorRuntime.regeneratorRuntimeStrings.`throw`]
  }
  
  @js.native
  trait Context[TYield, TReturn, TNext]
    extends /* temp */ StringDictionary[js.Any] {
    
    /**
      * @param type The completion type.
      * @param arg The [[Value]] or [[Target]] of the completion record.
      */
    def abrupt(`type`: CompletionType): js.Any = js.native
    def abrupt(`type`: CompletionType, arg: js.Any): js.Any = js.native
    /**
      * @param type The completion type.
      * @param nextLoc The location label to resume iteration at.
      */
    @JSName("abrupt")
    def abrupt_break(`type`: break, nextLoc: Double): js.Any = js.native
    @JSName("abrupt")
    def abrupt_continue(`type`: continue, nextLoc: Double): js.Any = js.native
    /**
      * @param type The completion type.
      * @param rval The return value.
      */
    @JSName("abrupt")
    def abrupt_return(`type`: `return`): js.Any = js.native
    @JSName("abrupt")
    def abrupt_return(`type`: `return`, rval: TReturn): js.Any = js.native
    /**
      * @param type The completion type.
      * @param exception The exception to throw.
      */
    @JSName("abrupt")
    def abrupt_throw(`type`: `throw`): scala.Nothing = js.native
    @JSName("abrupt")
    def abrupt_throw(`type`: `throw`, exception: js.Any): scala.Nothing = js.native
    
    /**
      * The argument passed to the generator method.
      */
    var arg: js.Any = js.native
    
    /**
      * Used to obtain the exception that was thrown in the associated try block.
      *
      * @param tryLoc The label of the beginning of the try block.
      */
    def `catch`(tryLoc: Double): js.Any = js.native
    
    /**
      * @param record The completion record.
      * @param afterLoc The location to resume the generator at, only used by normal completions.
      */
    def complete(record: ReadonlyCompletionRecord): js.Any = js.native
    def complete(record: ReadonlyCompletionRecord, afterLoc: ContextLocation): js.Any = js.native
    
    /**
      * If truthy, then it contains information about the currently `yield*` delegated iterator.
      */
    var delegate: js.UndefOr[DelegatedIterator] = js.native
    
    /**
      * @param iterable The iterable to delegate to.
      * @param resultName The name of the property to assign to on this context.
      * @param nextLoc The label of the location where to resume iteration.
      */
    def delegateYield(iterable: `0`[TYield], resultName: String, nextLoc: ContextLocation): js.Any = js.native
    
    /**
      * Dispatches an exception to `innerFn`
      *
      * @param exception The exception to dispatch.
      */
    def dispatchException(exception: js.Any): Boolean = js.native
    
    /**
      * Whether the generator has finished.
      */
    var done: Boolean = js.native
    
    /**
      * Used to signify the end of a finally block.
      *
      * @param finallyLoc The label of the beginning of the finally block.
      */
    def finish(finallyLoc: Double): js.Any = js.native
    
    /**
      * The generator method.
      */
    var method: next | `return` | `throw` = js.native
    
    /**
      * The label of the next location, is set to `'end'` when the generator needs to close abruptly.
      */
    var next: Double | end = js.native
    
    /**
      * The label of the previous location, needs to be set to `next` at the start of user code.
      */
    var prev: js.Any = js.native
    
    def reset(): Unit = js.native
    def reset(skipTempReset: Boolean): Unit = js.native
    
    /**
      * The return value, set by `abrupt("return")`.
      */
    var rval: TReturn = js.native
    
    /**
      * The value passed to `next()`.
      */
    var sent: TNext = js.native
    
    /**
      * Ends the iteration.
      */
    def stop(): TReturn = js.native
    
    val tryEntries: Array[readonlytryLocrootOmitTry | TryEntry] = js.native
  }
  
  type ContextLocation = Double | end
  
  @js.native
  trait DelegatedIterator extends StObject {
    
    var iterator: js.Iterator[_] = js.native
  }
  object DelegatedIterator {
    
    @scala.inline
    def apply(iterator: js.Iterator[_]): DelegatedIterator = {
      val __obj = js.Dynamic.literal(iterator = iterator.asInstanceOf[js.Any])
      __obj.asInstanceOf[DelegatedIterator]
    }
    
    @scala.inline
    implicit class DelegatedIteratorMutableBuilder[Self <: DelegatedIterator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIterator(value: js.Iterator[_]): Self = StObject.set(x, "iterator", value.asInstanceOf[js.Any])
    }
  }
  
  type InnerFunction[T, TYield, TReturn, TNext] = js.ThisFunction1[/* this */ T, /* context */ Context[TYield, TReturn, TNext], js.Any]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new <T>(executor : (resolve : (value : T | std.PromiseLike<T>): void, reject : (reason : any | undefined): void): void): std.PromiseLike<T> */ @js.native
  trait ResolvablePromiseConstructorLike extends StObject {
    
    def resolve[T](): js.Thenable[T] = js.native
    def resolve[T](value: T): js.Thenable[T] = js.native
  }
  
  @js.native
  trait TryEntry extends StObject {
    
    val afterLoc: js.UndefOr[ContextLocation] = js.native
    
    val catchLoc: js.UndefOr[Double] = js.native
    
    var completion: js.UndefOr[CompletionRecord] = js.native
    
    val finallyLoc: js.UndefOr[Double] = js.native
    
    val tryLoc: Double = js.native
  }
  object TryEntry {
    
    @scala.inline
    def apply(tryLoc: Double): TryEntry = {
      val __obj = js.Dynamic.literal(tryLoc = tryLoc.asInstanceOf[js.Any])
      __obj.asInstanceOf[TryEntry]
    }
    
    @scala.inline
    implicit class TryEntryMutableBuilder[Self <: TryEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterLoc(value: ContextLocation): Self = StObject.set(x, "afterLoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterLocUndefined: Self = StObject.set(x, "afterLoc", js.undefined)
      
      @scala.inline
      def setCatchLoc(value: Double): Self = StObject.set(x, "catchLoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatchLocUndefined: Self = StObject.set(x, "catchLoc", js.undefined)
      
      @scala.inline
      def setCompletion(value: CompletionRecord): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompletionUndefined: Self = StObject.set(x, "completion", js.undefined)
      
      @scala.inline
      def setFinallyLoc(value: Double): Self = StObject.set(x, "finallyLoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinallyLocUndefined: Self = StObject.set(x, "finallyLoc", js.undefined)
      
      @scala.inline
      def setTryLoc(value: Double): Self = StObject.set(x, "tryLoc", value.asInstanceOf[js.Any])
    }
  }
  
  type TryLocationsList = js.Array[
    (js.Tuple2[Double, Double]) | (js.Tuple4[Double, js.UndefOr[Double], Double, ContextLocation])
  ]
}
