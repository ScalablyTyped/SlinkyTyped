package typingsSlinky.sanctuary

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sanctuary.anon.CheckTypes
import typingsSlinky.sanctuary.anon.Fn0
import typingsSlinky.sanctuary.anon.FnCall
import typingsSlinky.sanctuary.anon.FnCallContravariant
import typingsSlinky.sanctuary.anon.FnCallF
import typingsSlinky.sanctuary.anon.FnCallFoldable
import typingsSlinky.sanctuary.anon.FnCallM
import typingsSlinky.sanctuary.anon.FnCallQ
import typingsSlinky.sanctuary.anon.FnCallR
import typingsSlinky.sanctuary.anon.FnCallX
import typingsSlinky.sanctuary.anon.FnCallXs
import typingsSlinky.sanctuary.anon.Name
import typingsSlinky.sanctuary.mod.Sanctuary.Environment
import typingsSlinky.sanctuary.sanctuaryStrings.sanctuarySlashEither
import typingsSlinky.sanctuary.sanctuaryStrings.sanctuarySlashMaybe
import typingsSlinky.sanctuary.sanctuaryStrings.sanctuarySlashPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("sanctuary", JSImport.Namespace)
  @js.native
  val ^ : Environment = js.native
  
  type Alt[A] = Functor[A]
  
  @js.native
  trait Alternative[A] extends Functor[A]
  
  type Applicative[A] = Apply[A]
  
  type Apply[A] = Functor[A]
  
  type Bifunctor[A, C] = Functor[C]
  
  type Category[A] = Semigroupoid[A, A]
  
  type Chain[A] = Apply[A]
  
  type ChainRec[A] = Chain[A]
  
  type Comonad[A] = Extend[A]
  
  @js.native
  trait Contravariant[A] extends StObject
  
  @js.native
  trait Either[A, B] extends StObject {
    
    var `@@type`: sanctuarySlashEither = js.native
  }
  object Either {
    
    @scala.inline
    def apply[A, B](`@@type`: sanctuarySlashEither): Either[A, B] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@@type")(`@@type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Either[A, B]]
    }
    
    @scala.inline
    implicit class EitherMutableBuilder[Self <: Either[_, _], A, B] (val x: Self with (Either[A, B])) extends AnyVal {
      
      @scala.inline
      def `set@@type`(value: sanctuarySlashEither): Self = StObject.set(x, "@@type", value.asInstanceOf[js.Any])
    }
  }
  
  type Extend[A] = Functor[A]
  
  type FiniteNumber = Double
  
  type Fn[A, B] = js.Function1[/* a */ A, B]
  
  type Fn2[A, B, C] = js.Function1[/* a */ A, js.Function1[/* b */ B, C]]
  
  type Fn2_[A, B, C] = js.Function2[/* a */ A, /* b */ B, C]
  
  type Fn3[A, B, C, D] = js.Function1[/* a */ A, js.Function1[/* b */ B, js.Function1[/* c */ C, D]]]
  
  type Fn3_[A, B, C, D] = js.Function3[/* a */ A, /* b */ B, /* c */ C, D]
  
  type Fn4[A, B, C, D, E] = js.Function1[
    /* a */ A, 
    js.Function1[/* b */ B, js.Function1[/* c */ C, js.Function1[/* d */ D, E]]]
  ]
  
  type Fn4_[A, B, C, D, E] = js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E]
  
  type Fn5[A, B, C, D, E, F] = js.Function1[
    /* a */ A, 
    js.Function1[
      /* b */ B, 
      js.Function1[/* c */ C, js.Function1[/* d */ D, js.Function1[/* e */ E, F]]]
    ]
  ]
  
  type Fn5_[A, B, C, D, E, F] = js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F]
  
  @js.native
  trait Foldable[A] extends StObject
  
  @js.native
  trait Functor[A] extends StObject
  
  type Integer = Double
  
  @js.native
  trait ListToMaybeList extends StObject {
    
    def apply(xs: String): Maybe[String] = js.native
    def apply[A](xs: js.Array[A]): Maybe[js.Array[A]] = js.native
  }
  
  @js.native
  trait MatchObj extends StObject {
    
    var groups: js.Array[Maybe[String]] = js.native
    
    var `match`: String = js.native
  }
  object MatchObj {
    
    @scala.inline
    def apply(groups: js.Array[Maybe[String]], `match`: String): MatchObj = {
      val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchObj]
    }
    
    @scala.inline
    implicit class MatchObjMutableBuilder[Self <: MatchObj] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroups(value: js.Array[Maybe[String]]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsVarargs(value: Maybe[String]*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Maybe[A] extends StObject {
    
    var `@@type`: sanctuarySlashMaybe = js.native
  }
  object Maybe {
    
    @scala.inline
    def apply[A](`@@type`: sanctuarySlashMaybe): Maybe[A] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@@type")(`@@type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Maybe[A]]
    }
    
    @scala.inline
    implicit class MaybeMutableBuilder[Self <: Maybe[_], A] (val x: Self with Maybe[A]) extends AnyVal {
      
      @scala.inline
      def `set@@type`(value: sanctuarySlashMaybe): Self = StObject.set(x, "@@type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Monad[A] extends Functor[A]
  
  type Monoid[A] = Semigroup[A]
  
  type NonNegativeInteger = Double
  
  type NonZeroFiniteNumber = Double
  
  type Nullable[A] = A | Null
  
  type Ord[A] = Setoid[A]
  
  @js.native
  trait Pair[A, B] extends StObject {
    
    var `@@type`: sanctuarySlashPair = js.native
  }
  object Pair {
    
    @scala.inline
    def apply[A, B](`@@type`: sanctuarySlashPair): Pair[A, B] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@@type")(`@@type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pair[A, B]]
    }
    
    @scala.inline
    implicit class PairMutableBuilder[Self <: Pair[_, _], A, B] (val x: Self with (Pair[A, B])) extends AnyVal {
      
      @scala.inline
      def `set@@type`(value: sanctuarySlashPair): Self = StObject.set(x, "@@type", value.asInstanceOf[js.Any])
    }
  }
  
  type Plus[A] = Alt[A]
  
  type Predicate[A] = js.Function1[/* a */ A, Boolean]
  
  type Profunctor[B, C] = Functor[C]
  
  object Sanctuary {
    
    @js.native
    trait Environment extends Static {
      
      def create(opts: CheckTypes): Static = js.native
      
      var env: js.Array[_] = js.native
      
      var unchecked: Static = js.native
    }
    
    @js.native
    trait Static extends StObject {
      
      var Either: TypeRep = js.native
      
      //  Combinator
      def I[A](x: A): A = js.native
      
      def Just[A](x: A): Maybe[A] = js.native
      
      def K[A](x: A): js.Function1[/* y */ js.Any, A] = js.native
      
      def Left[A](x: A): Either[A, _] = js.native
      
      var Maybe: TypeRep = js.native
      
      var Nothing: Maybe[_] = js.native
      
      // Pair
      def Pair[A](a: A): js.Function1[/* b */ js.Any, typingsSlinky.sanctuary.mod.Pair[A, _]] = js.native
      
      def Right[A](x: A): Either[_, A] = js.native
      
      def T[A](x: A): js.Function1[/* f */ Fn[A, _], _] = js.native
      
      def add(p: FiniteNumber): js.Function1[/* q */ FiniteNumber, FiniteNumber] = js.native
      
      def all[A](p: Predicate[A]): js.Function1[/* q */ Foldable[A], Boolean] = js.native
      
      def alt[A](x: A): js.Function1[/* y */ A, A] = js.native
      
      //  Logic
      def and(p: Boolean): js.Function1[/* q */ Boolean, Boolean] = js.native
      
      def any[A](p: Predicate[A]): js.Function1[/* q */ Foldable[A], Boolean] = js.native
      
      def ap[A, B](p: Apply[Fn[A, B]]): js.Function1[/* q */ Apply[A], Apply[B]] = js.native
      
      def apFirst[A](x: Apply[A]): js.Function1[/* y */ Apply[_], Apply[A]] = js.native
      
      def apSecond(x: Apply[_]): js.Function1[/* y */ Apply[_], Apply[_]] = js.native
      
      //  Array
      //  TODO: Fantasyland overloads, non-curried versions
      def append[A](x: A): FnCallXs[A] = js.native
      
      //  List
      def array[A, B](p: B): js.Function1[/* q */ Fn2[A, js.Array[A], B], js.Function1[/* r */ js.Array[A], B]] = js.native
      
      def bimap[A, B](p: Fn[A, B]): js.Function1[/* q */ Fn[_, _], js.Function1[/* r */ Bifunctor[A, _], Bifunctor[B, _]]] = js.native
      
      def boolean[A](p: A): js.Function1[/* q */ A, js.Function1[/* b */ Boolean, A]] = js.native
      
      def chain[A, B](f: Fn[A, Chain[B]]): js.Function1[/* chain_ */ Chain[A], Chain[B]] = js.native
      
      def chainRec(typeRep: TypeRep): FnCallF = js.native
      
      @JSName("chain")
      def chain_ABX[A, B, X](f: Fn2[A, X, B]): js.Function1[/* chain_ */ Fn[X, A], Fn[X, B]] = js.native
      
      def clamp[A](x: A): js.Function1[/* y */ A, js.Function1[/* z */ A, A]] = js.native
      
      def complement[A](p: Predicate[A]): Predicate[A] = js.native
      
      //  Composition
      def compose[B, C](f: Fn[B, C]): js.Function1[/* g */ Fn[_, B], Fn[_, C]] = js.native
      def compose[B, C](x: Semigroupoid[B, C]): js.Function1[/* y */ Semigroupoid[_, B], Semigroupoid[_, C]] = js.native
      
      def concat(x: String): js.Function1[/* y */ String, String] = js.native
      def concat[A](x: js.Array[A]): js.Function1[/* y */ js.Array[A], js.Array[A]] = js.native
      def concat[A](x: Semigroup[A]): js.Function1[/* y */ Semigroup[A], Semigroup[A]] = js.native
      def concat[A](x: StrMap[A]): js.Function1[/* y */ StrMap[A], StrMap[A]] = js.native
      
      def contramap[A, B](f: Fn[B, A]): FnCallContravariant[A, B] = js.native
      
      //  Function
      def curry2[A, B, C](f: Fn2_[A, B, C]): Fn2[A, B, C] = js.native
      
      def curry3[A, B, C, D](f: Fn3_[A, B, C, D]): Fn3[A, B, C, D] = js.native
      
      def curry4[A, B, C, D, E](f: Fn4_[A, B, C, D, E]): Fn4[A, B, C, D, E] = js.native
      
      def curry5[A, B, C, D, E, F](f: Fn5_[A, B, C, D, E, F]): Fn5[A, B, C, D, E, F] = js.native
      
      def div(p: NonZeroFiniteNumber): js.Function1[/* q */ FiniteNumber, FiniteNumber] = js.native
      
      def drop(n: Integer): ListToMaybeList = js.native
      
      def dropLast(n: Integer): ListToMaybeList = js.native
      
      def dropWhile[A](pred: Predicate[A]): js.Function1[/* foldable */ Foldable[A], Foldable[A]] = js.native
      
      def duplicate[A](comonad: js.Array[A]): js.Array[js.Array[A]] = js.native
      def duplicate[A](comonad: Comonad[A]): Comonad[Comonad[A]] = js.native
      def duplicate[A](comonad: Maybe[A]): Maybe[Maybe[A]] = js.native
      def duplicate[A, B](comonad: Pair[A, B]): Pair[A, Pair[A, B]] = js.native
      
      def either[A, C](p: Fn[A, C]): js.Function1[/* q */ Fn[_, C], js.Function1[/* r */ Either[A, _], C]] = js.native
      
      def eitherToMaybe[B](p: Either[_, B]): Maybe[B] = js.native
      
      def elem[A](p: A): js.Function1[/* q */ Foldable[A] | StrMap[A] | js.Array[A], Boolean] = js.native
      
      def empty(p: TypeRep): Monoid[_] = js.native
      
      def encase[E, A, B](throwing: Fn[A, B]): js.Function1[/* a */ A, Either[E, B]] = js.native
      
      //  Integer
      def even(n: Integer): Boolean = js.native
      
      def extend[A, B](f: Fn[Extend[A], B]): js.Function1[/* extend_ */ Extend[A], Extend[B]] = js.native
      
      def extract[A](comonad: Comonad[A]): A = js.native
      
      def filter[A](pred: Predicate[A]): FnCallM[A] = js.native
      
      def find[A](p: Predicate[A]): js.Function1[/* q */ js.Array[A] | StrMap[A] | Foldable[A], Maybe[A]] = js.native
      
      def flip[A, B, C](f: Fn2[A, B, C]): Fn2[B, A, C] = js.native
      
      def foldMap[A, M](t: TypeRep): js.Function1[/* f */ Fn[_, _], js.Function1[/* g */ Foldable[_], _]] = js.native
      
      def fromEither[B](p: B): js.Function1[/* q */ Either[_, B], B] = js.native
      
      def fromLeft[A](p: A): js.Function1[/* q */ Either[A, _], A] = js.native
      
      def fromMaybe[A](p: A): js.Function1[/* q */ Maybe[A], A] = js.native
      
      def fromMaybe_[A](p: Thunk[A]): js.Function1[/* q */ Maybe[A], A] = js.native
      
      def fromRight[B](p: B): js.Function1[/* q */ Either[_, B], B] = js.native
      
      def fst[A, B](p: Pair[A, B]): A = js.native
      
      def get(p: Predicate[_]): js.Function1[/* q */ String, js.Function1[/* r */ _, Maybe[_]]] = js.native
      
      def gets(p: Predicate[_]): js.Function1[/* q */ js.Array[String], js.Function1[/* r */ _, Maybe[_]]] = js.native
      
      def groupBy[A](f: Fn2[A, A, Boolean]): js.Function1[/* xs */ js.Array[A], js.Array[js.Array[A]]] = js.native
      
      def gt[A](x: A): js.Function1[/* y */ A, Boolean] = js.native
      
      def gte[A](x: A): js.Function1[/* y */ A, Boolean] = js.native
      
      def head(xs: String): Maybe[String] = js.native
      def head[A](xs: js.Array[A]): Maybe[A] = js.native
      
      def id[A](p: TypeRep): (Fn[A, A]) | Category[_] = js.native
      
      def ifElse[A, B](p: Predicate[A]): js.Function1[/* q */ Fn[A, B], js.Function1[/* r */ Fn[A, B], Fn[A, B]]] = js.native
      
      def init(xs: String): Maybe[String] = js.native
      def init[A](xs: js.Array[A]): Maybe[js.Array[A]] = js.native
      
      def intercalate[A](p: A): js.Function1[/* q */ Foldable[A], A] = js.native
      
      def is(typeRep: TypeRep): js.Function1[/* x */ js.Any, Boolean] = js.native
      
      def isJust[A](p: Maybe[A]): Boolean = js.native
      
      // Either
      def isLeft(p: Either[_, _]): Boolean = js.native
      
      //  Maybe
      def isNothing[A](p: Maybe[A]): Boolean = js.native
      
      def isRight(p: Either[_, _]): Boolean = js.native
      
      def join[A](chain_ : js.Array[js.Array[A]]): js.Array[A] = js.native
      def join[A](chain_ : Chain[Chain[A]]): Chain[A] = js.native
      def join[A](chain_ : Maybe[Maybe[A]]): Maybe[A] = js.native
      def join[A, B](chain_ : Fn2[B, B, A]): Fn[B, A] = js.native
      
      def joinWith(p: String): js.Function1[/* q */ js.Array[String], String] = js.native
      
      def justs[A](p: js.Array[Maybe[A]]): js.Array[A] = js.native
      
      def keys(p: StrMap[_]): js.Array[String] = js.native
      
      def last(xs: String): Maybe[String] = js.native
      def last[A](xs: js.Array[A]): Maybe[A] = js.native
      
      def lefts[A](p: js.Array[Either[A, _]]): js.Array[A] = js.native
      
      def lift2[A, B, C](f: Fn2[A, B, C]): FnCallX[A, B, C] = js.native
      
      def lift3[A, B, C, D](f: Fn3[A, B, C, D]): Fn0[A, B, C, D] = js.native
      
      def lines(s: String): js.Array[String] = js.native
      
      def lt[A](x: A): js.Function1[/* y */ A, Boolean] = js.native
      
      def lte[A](x: A): js.Function1[/* y */ A, Boolean] = js.native
      
      def map[A, B](p: Fn[A, B]): FnCall[A, B] = js.native
      
      def mapLeft[A, B](p: Fn[A, B]): FnCallQ[B] = js.native
      
      def mapMaybe[A](p: Fn[A, Maybe[_]]): js.Function1[/* q */ js.Array[A], js.Array[A]] = js.native
      
      def `match`(pattern: js.RegExp): js.Function1[/* q */ String, js.Array[Maybe[MatchObj]]] = js.native
      
      def matchAll(pattern: js.RegExp): js.Function1[/* q */ String, js.Array[MatchObj]] = js.native
      
      def max[A](x: A): js.Function1[/* y */ A, A] = js.native
      
      def maybe[B](p: B): js.Function1[/* q */ Fn[_, B], js.Function1[/* r */ Maybe[_], B]] = js.native
      
      def maybeToEither[A](p: A): js.Function1[/* q */ Maybe[_], Either[A, _]] = js.native
      
      def maybeToNullable[A](p: Maybe[A]): Nullable[A] = js.native
      
      def maybe_[B](p: Thunk[B]): js.Function1[/* q */ Fn[_, B], js.Function1[/* r */ Maybe[_], B]] = js.native
      
      def mean(p: js.Array[FiniteNumber]): Maybe[FiniteNumber] = js.native
      def mean(p: Foldable[FiniteNumber]): Maybe[FiniteNumber] = js.native
      
      def min[A](x: A): js.Function1[/* y */ A, A] = js.native
      
      def mult(x: FiniteNumber): js.Function1[/* q */ FiniteNumber, FiniteNumber] = js.native
      
      //  Number
      def negate(n: ValidNumber): ValidNumber = js.native
      
      def none[A](p: Predicate[A]): js.Function1[/* q */ Foldable[A], Boolean] = js.native
      
      def not(p: Boolean): Boolean = js.native
      
      def odd(n: Integer): Boolean = js.native
      
      def of[A](typeRep: TypeRep): js.Function1[/* x */ A, Fn[_, A]] = js.native
      
      def on[A, B, C](p: Fn2[B, B, C]): js.Function1[/* q */ Fn[A, B], js.Function1[/* r */ A, Fn[A, C]]] = js.native
      
      def or(p: Boolean): js.Function1[/* q */ Boolean, Boolean] = js.native
      
      def pair[A, B, C](f: Fn2[A, B, C]): js.Function1[/* p */ Pair[A, B], C] = js.native
      
      def pairs[A](p: StrMap[A]): js.Array[Pair[String, A]] = js.native
      
      //  Parse
      def parseDate(s: String): Maybe[js.Date] = js.native
      
      def parseFloat(s: String): Maybe[Double] = js.native
      
      def parseInt(p: Integer): js.Function1[/* q */ String, Maybe[Integer]] = js.native
      
      def parseJson(p: Predicate[_]): js.Function1[/* q */ String, Maybe[_]] = js.native
      
      def pipe(fs: js.Array[Fn[_, _]]): js.Function1[/* x */ js.Any, _] = js.native
      def pipe[A, B, C](fs: js.Tuple2[Fn[A, B], Fn[B, C]]): js.Function1[/* x */ A, C] = js.native
      def pipe[A, B, C, D](fs: js.Tuple3[Fn[A, B], Fn[B, C], Fn[C, D]]): js.Function1[/* x */ A, D] = js.native
      def pipe[A, B, C, D, E](fs: js.Tuple4[Fn[A, B], Fn[B, C], Fn[C, D], Fn[D, E]]): js.Function1[/* x */ A, E] = js.native
      def pipe[A, B, C, D, E, F](fs: js.Tuple5[Fn[A, B], Fn[B, C], Fn[C, D], Fn[D, E], Fn[E, F]]): js.Function1[/* x */ A, F] = js.native
      
      def pipeK[B](fs: js.Array[Fn[_, Chain[_]]]): js.Function1[/* chain_ */ Chain[_], Chain[B]] = js.native
      
      @JSName("pipe")
      def pipe_AB[A, B](fs: js.Array[Fn[A, B]]): js.Function1[/* x */ A, B] = js.native
      
      def pow(p: FiniteNumber): js.Function1[/* q */ FiniteNumber, FiniteNumber] = js.native
      
      def prepend[A](x: A): FnCallXs[A] = js.native
      
      def product(p: js.Array[FiniteNumber]): FiniteNumber = js.native
      def product(p: Foldable[FiniteNumber]): FiniteNumber = js.native
      
      def promap[A, B](p: Fn[A, B]): js.Function1[/* q */ Fn[_, _], FnCallR[B, _, A, _]] = js.native
      
      //  Object
      def prop(p: String): js.Function1[/* q */ js.Any, _] = js.native
      
      def props(p: js.Array[String]): js.Function1[/* q */ js.Any, _] = js.native
      
      def range(from: Integer): js.Function1[/* to */ Integer, js.Array[Integer]] = js.native
      
      def reduce[A, B](p: Fn2[B, A, B]): js.Function1[
            /* q */ B, 
            js.Function1[/* r */ js.Array[A] | StrMap[A] | Maybe[A] | (Either[_, A]) | Foldable[A], B]
          ] = js.native
      
      //  RegExp
      def regex(p: String): js.Function1[/* q */ String, js.RegExp] = js.native
      
      def regexEscape(s: String): String = js.native
      
      def reject[A](pred: Predicate[A]): FnCallM[A] = js.native
      
      def reverse[A](foldable: js.Array[A]): js.Array[A] = js.native
      def reverse[A](foldable: Foldable[A]): Foldable[A] = js.native
      
      def rights[B](p: js.Array[Either[_, B]]): js.Array[B] = js.native
      
      def sequence(typeRep: TypeRep): js.Function1[/* traversable */ Traversable[Applicative[_]], Applicative[Traversable[_]]] = js.native
      
      //  Showable
      def show(x: js.Any): String = js.native
      
      def snd[A, B](p: Pair[A, B]): B = js.native
      
      def sort[A](foldable: js.Array[A]): js.Array[A] = js.native
      def sort[A](foldable: Foldable[A]): Foldable[A] = js.native
      
      def sortBy[A](f: Fn[A, Ord[_]]): FnCallFoldable[A] = js.native
      
      def splitOn(separator: String): js.Function1[/* q */ String, js.Array[String]] = js.native
      
      def splitOnRegex(pattern: js.RegExp): js.Function1[/* q */ String, js.Array[String]] = js.native
      
      def stripPrefix(prefix: String): js.Function1[/* q */ String, Maybe[String]] = js.native
      
      def stripSuffix(suffix: String): js.Function1[/* q */ String, Maybe[String]] = js.native
      
      def sub(p: FiniteNumber): js.Function1[/* q */ FiniteNumber, FiniteNumber] = js.native
      
      def sum(p: js.Array[FiniteNumber]): FiniteNumber = js.native
      def sum(p: Foldable[FiniteNumber]): FiniteNumber = js.native
      
      def swap[A, B](p: Pair[A, B]): Pair[B, A] = js.native
      
      def tagBy[A](p: Predicate[A]): js.Function1[/* q */ A, Either[A, A]] = js.native
      
      def tail(xs: String): Maybe[String] = js.native
      def tail[A](xs: js.Array[A]): Maybe[js.Array[A]] = js.native
      
      def take(n: Integer): ListToMaybeList = js.native
      
      def takeLast(n: Integer): ListToMaybeList = js.native
      
      def takeWhile[A](pred: Predicate[A]): js.Function1[/* foldable */ Foldable[A], Foldable[A]] = js.native
      
      def test(pattern: js.RegExp): Predicate[String] = js.native
      
      def toLower(s: String): String = js.native
      
      //  String
      def toUpper(s: String): String = js.native
      
      def traverse(typeRep: TypeRep): js.Function1[
            /* f */ Fn[_, Applicative[_]], 
            js.Function1[/* traversable */ Traversable[_], Applicative[Traversable[_]]]
          ] = js.native
      
      def trim(s: String): String = js.native
      
      //  Classify
      def `type`(x: js.Any): Name = js.native
      
      def unfoldr[A, B](f: Fn[B, Maybe[Pair[A, B]]]): js.Function1[/* x */ B, js.Array[A]] = js.native
      
      def unless[A](p: Predicate[A]): js.Function1[/* q */ Fn[A, A], Fn[A, A]] = js.native
      
      def unlines(xs: js.Array[String]): String = js.native
      
      def unwords(xs: js.Array[String]): String = js.native
      
      //  StrMap
      def value[A](p: String): js.Function1[/* p */ StrMap[A], Maybe[A]] = js.native
      
      def values[A](p: StrMap[A]): js.Array[A] = js.native
      
      def when[A](p: Predicate[A]): js.Function1[/* q */ Fn[A, A], Fn[A, A]] = js.native
      
      def words(s: String): js.Array[String] = js.native
      
      def zero(p: TypeRep): Plus[_] = js.native
      
      def zip[A](p: js.Array[A]): js.Function1[/* q */ js.Array[_], js.Array[Pair[A, _]]] = js.native
      
      def zipWith[A, B, C](f: Fn2[A, B, C]): js.Function1[/* p */ js.Array[_], js.Function1[/* q */ js.Array[_], js.Array[C]]] = js.native
    }
  }
  
  @js.native
  trait Semigroup[A] extends StObject
  
  @js.native
  trait Semigroupoid[A, B] extends StObject
  
  @js.native
  trait Setoid[A] extends StObject
  
  type StrMap[A] = StringDictionary[A]
  
  type Thunk[A] = js.Function0[A]
  
  @js.native
  trait Traversable[A]
    extends Functor[A]
       with Foldable[A]
  
  @js.native
  trait TypeRep extends StObject
  
  type ValidNumber = Double
  
  type _To = Environment
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Environment = ^
}
