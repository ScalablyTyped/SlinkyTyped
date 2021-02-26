package typingsSlinky.gremlin.mod

import typingsSlinky.gremlin.mod.driver.RemoteConnection
import typingsSlinky.gremlin.mod.structure.Graph
import typingsSlinky.std.AsyncIterableIterator
import typingsSlinky.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object process {
  
  @JSImport("gremlin", "process.AnonymousTraversalSource")
  @js.native
  class AnonymousTraversalSource[S /* <: GraphTraversalSource[GraphTraversal] */] () extends StObject {
    
    def withGraph(graph: Graph): S = js.native
    
    def withRemote(remoteConnection: RemoteConnection): S = js.native
  }
  object AnonymousTraversalSource {
    
    /* static member */
    @JSImport("gremlin", "process.AnonymousTraversalSource.traversal")
    @js.native
    def traversal[S /* <: GraphTraversalSource[GraphTraversal] */](): AnonymousTraversalSource[S] = js.native
    @JSImport("gremlin", "process.AnonymousTraversalSource.traversal")
    @js.native
    def traversal[S /* <: GraphTraversalSource[GraphTraversal] */](traversalSourceClass: Newable[S]): AnonymousTraversalSource[S] = js.native
  }
  
  @JSImport("gremlin", "process.Bytecode")
  @js.native
  class Bytecode () extends StObject {
    def this(toClone: Bytecode) = this()
    
    def addSource(name: String): Bytecode = js.native
    def addSource(name: String, values: js.Array[_]): Bytecode = js.native
    
    def addStep(name: String): Bytecode = js.native
    def addStep(name: String, values: js.Array[_]): Bytecode = js.native
  }
  
  @JSImport("gremlin", "process.EnumValue")
  @js.native
  class EnumValue protected () extends StObject {
    def this(typeName: String, elementName: String) = this()
  }
  
  @JSImport("gremlin", "process.GraphTraversal")
  @js.native
  class GraphTraversal protected () extends Traversal_ {
    def this(graph: Nullable[Graph], traversalStrategies: Nullable[TraversalStrategies], bytecode: Bytecode) = this()
    
    def V(args: js.Any*): this.type = js.native
    
    def addE(args: js.Any*): this.type = js.native
    
    def addV(args: js.Any*): this.type = js.native
    
    def aggregate(args: js.Any*): this.type = js.native
    
    def and(args: js.Any*): this.type = js.native
    
    def as(args: js.Any*): this.type = js.native
    
    def barrier(args: js.Any*): this.type = js.native
    
    def both(args: js.Any*): this.type = js.native
    
    def bothE(args: js.Any*): this.type = js.native
    
    def bothV(args: js.Any*): this.type = js.native
    
    def branch(args: js.Any*): this.type = js.native
    
    def by(args: js.Any*): this.type = js.native
    
    def cap(args: js.Any*): this.type = js.native
    
    def choose(args: js.Any*): this.type = js.native
    
    def coalesce(args: js.Any*): this.type = js.native
    
    def coin(args: js.Any*): this.type = js.native
    
    def connectedComponent(args: js.Any*): this.type = js.native
    
    def constant(args: js.Any*): this.type = js.native
    
    def count(args: js.Any*): this.type = js.native
    
    def cyclicPath(args: js.Any*): this.type = js.native
    
    def dedup(args: js.Any*): this.type = js.native
    
    def drop(args: js.Any*): this.type = js.native
    
    def elementMap(args: js.Any*): this.type = js.native
    
    def emit(args: js.Any*): this.type = js.native
    
    def filter(args: js.Any*): this.type = js.native
    
    def flatMap(args: js.Any*): this.type = js.native
    
    def fold(args: js.Any*): this.type = js.native
    
    def from_(args: js.Any*): this.type = js.native
    
    def group(args: js.Any*): this.type = js.native
    
    def groupCount(args: js.Any*): this.type = js.native
    
    def has(args: js.Any*): this.type = js.native
    
    def hasId(args: js.Any*): this.type = js.native
    
    def hasKey(args: js.Any*): this.type = js.native
    
    def hasLabel(args: js.Any*): this.type = js.native
    
    def hasNot(args: js.Any*): this.type = js.native
    
    def hasValue(args: js.Any*): this.type = js.native
    
    def id(args: js.Any*): this.type = js.native
    
    def identity(args: js.Any*): this.type = js.native
    
    def inE(args: js.Any*): this.type = js.native
    
    def inV(args: js.Any*): this.type = js.native
    
    def in_(args: js.Any*): this.type = js.native
    
    def index(args: js.Any*): this.type = js.native
    
    def inject(args: js.Any*): this.type = js.native
    
    def is(args: js.Any*): this.type = js.native
    
    def key(args: js.Any*): this.type = js.native
    
    def label(args: js.Any*): this.type = js.native
    
    def limit(args: js.Any*): this.type = js.native
    
    def local(args: js.Any*): this.type = js.native
    
    def loops(args: js.Any*): this.type = js.native
    
    def map(args: js.Any*): this.type = js.native
    
    def `match`(args: js.Any*): this.type = js.native
    
    def math(args: js.Any*): this.type = js.native
    
    def max(args: js.Any*): this.type = js.native
    
    def mean(args: js.Any*): this.type = js.native
    
    def min(args: js.Any*): this.type = js.native
    
    def not(args: js.Any*): this.type = js.native
    
    def option(args: js.Any*): this.type = js.native
    
    def optional(args: js.Any*): this.type = js.native
    
    def or(args: js.Any*): this.type = js.native
    
    def order(args: js.Any*): this.type = js.native
    
    def otherV(args: js.Any*): this.type = js.native
    
    def out(args: js.Any*): this.type = js.native
    
    def outE(args: js.Any*): this.type = js.native
    
    def outV(args: js.Any*): this.type = js.native
    
    def pageRank(args: js.Any*): this.type = js.native
    
    def path(args: js.Any*): this.type = js.native
    
    def peerPressure(args: js.Any*): this.type = js.native
    
    def profile(args: js.Any*): this.type = js.native
    
    def program(args: js.Any*): this.type = js.native
    
    def project(args: js.Any*): this.type = js.native
    
    def properties(args: js.Any*): this.type = js.native
    
    def property(args: js.Any*): this.type = js.native
    
    def propertyMap(args: js.Any*): this.type = js.native
    
    def range(args: js.Any*): this.type = js.native
    
    def read(args: js.Any*): this.type = js.native
    
    def repeat(args: js.Any*): this.type = js.native
    
    def sack(args: js.Any*): this.type = js.native
    
    def sample(args: js.Any*): this.type = js.native
    
    def select(args: js.Any*): this.type = js.native
    
    def shortestPath(args: js.Any*): this.type = js.native
    
    def sideEffect(args: js.Any*): this.type = js.native
    
    def simplePath(args: js.Any*): this.type = js.native
    
    def skip(args: js.Any*): this.type = js.native
    
    def store(args: js.Any*): this.type = js.native
    
    def subgraph(args: js.Any*): this.type = js.native
    
    def sum(args: js.Any*): this.type = js.native
    
    def tail(args: js.Any*): this.type = js.native
    
    def timeLimit(args: js.Any*): this.type = js.native
    
    def times(args: js.Any*): this.type = js.native
    
    def to(args: js.Any*): this.type = js.native
    
    def toE(args: js.Any*): this.type = js.native
    
    def toV(args: js.Any*): this.type = js.native
    
    def tree(args: js.Any*): this.type = js.native
    
    def unfold(args: js.Any*): this.type = js.native
    
    def union(args: js.Any*): this.type = js.native
    
    def until(args: js.Any*): this.type = js.native
    
    def value(args: js.Any*): this.type = js.native
    
    def valueMap(args: js.Any*): this.type = js.native
    
    def values(args: js.Any*): this.type = js.native
    
    def where(args: js.Any*): this.type = js.native
    
    def with_(args: js.Any*): this.type = js.native
    
    def write(args: js.Any*): this.type = js.native
  }
  
  @JSImport("gremlin", "process.GraphTraversalSource")
  @js.native
  class GraphTraversalSource[T /* <: GraphTraversal */] protected () extends StObject {
    def this(graph: Nullable[Graph], traversalStrategies: Nullable[TraversalStrategies]) = this()
    def this(graph: Nullable[Graph], traversalStrategies: Nullable[TraversalStrategies], bytecode: Bytecode) = this()
    def this(
      graph: Nullable[Graph],
      traversalStrategies: Nullable[TraversalStrategies],
      bytecode: js.UndefOr[scala.Nothing],
      graphTraversalSourceClass: Newable[GraphTraversalSource[GraphTraversal]]
    ) = this()
    def this(
      graph: Nullable[Graph],
      traversalStrategies: Nullable[TraversalStrategies],
      bytecode: Bytecode,
      graphTraversalSourceClass: Newable[GraphTraversalSource[GraphTraversal]]
    ) = this()
    def this(
      graph: Nullable[Graph],
      traversalStrategies: Nullable[TraversalStrategies],
      bytecode: js.UndefOr[scala.Nothing],
      graphTraversalSourceClass: js.UndefOr[scala.Nothing],
      graphTraversalClass: Newable[T]
    ) = this()
    def this(
      graph: Nullable[Graph],
      traversalStrategies: Nullable[TraversalStrategies],
      bytecode: js.UndefOr[scala.Nothing],
      graphTraversalSourceClass: Newable[GraphTraversalSource[GraphTraversal]],
      graphTraversalClass: Newable[T]
    ) = this()
    def this(
      graph: Nullable[Graph],
      traversalStrategies: Nullable[TraversalStrategies],
      bytecode: Bytecode,
      graphTraversalSourceClass: js.UndefOr[scala.Nothing],
      graphTraversalClass: Newable[T]
    ) = this()
    def this(
      graph: Nullable[Graph],
      traversalStrategies: Nullable[TraversalStrategies],
      bytecode: Bytecode,
      graphTraversalSourceClass: Newable[GraphTraversalSource[GraphTraversal]],
      graphTraversalClass: Newable[T]
    ) = this()
    
    def E(args: js.Any*): T = js.native
    
    def V(args: js.Any*): T = js.native
    
    def addE(args: js.Any*): T = js.native
    
    def addV(args: js.Any*): T = js.native
    
    def inject(args: js.Any*): T = js.native
    
    def io(args: js.Any*): T = js.native
    
    def withBulk(args: js.Any*): this.type = js.native
    
    def withPath(args: js.Any*): this.type = js.native
    
    def withRemote(remoteConnection: RemoteConnection): this.type = js.native
    
    def withSack(args: js.Any*): this.type = js.native
    
    def withSideEffect(args: js.Any*): this.type = js.native
    
    def withStrategies(args: js.Any*): this.type = js.native
    
    def with_(args: js.Any*): this.type = js.native
    
    def withoutStrategies(args: js.Any*): this.type = js.native
  }
  
  @JSImport("gremlin", "process.P")
  @js.native
  class P protected () extends StObject {
    def this(operator: EnumValue, value: js.Any) = this()
    def this(operator: EnumValue, value: js.Any, other: js.Any) = this()
    
    def and(): P = js.native
    def and(arg: js.Any): P = js.native
    
    def or(): P = js.native
    def or(arg: js.Any): P = js.native
  }
  object P {
    
    /* static member */
    @JSImport("gremlin", "process.P.between")
    @js.native
    def between(args: js.Any*): P = js.native
    
    /* static member */
    @JSImport("gremlin", "process.P.eq")
    @js.native
    def eq_(args: js.Any*): P = js.native
    
    /* static member */
    @JSImport("gremlin", "process.P.gt")
    @js.native
    def gt(args: js.Any*): P = js.native
    
    /* static member */
    @JSImport("gremlin", "process.P.gte")
    @js.native
    def gte(args: js.Any*): P = js.native
    
    /* static member */
    @JSImport("gremlin", "process.P.inside")
    @js.native
    def inside(args: js.Any*): P = js.native
    
    /* static member */
    @JSImport("gremlin", "process.P.lt")
    @js.native
    def lt(args: js.Any*): P = js.native
    
    /* static member */
    @JSImport("gremlin", "process.P.lte")
    @js.native
    def lte(args: js.Any*): P = js.native
    
    /* static member */
    @JSImport("gremlin", "process.P.neq")
    @js.native
    def neq(args: js.Any*): P = js.native
    
    /* static member */
    @JSImport("gremlin", "process.P.not")
    @js.native
    def not(args: js.Any*): P = js.native
    
    /* static member */
    @JSImport("gremlin", "process.P.outside")
    @js.native
    def outside(args: js.Any*): P = js.native
    
    /* static member */
    @JSImport("gremlin", "process.P.test")
    @js.native
    def test(args: js.Any*): P = js.native
    
    /* static member */
    @JSImport("gremlin", "process.P.within")
    @js.native
    def within(args: js.Any*): P = js.native
    
    /* static member */
    @JSImport("gremlin", "process.P.without")
    @js.native
    def without(args: js.Any*): P = js.native
  }
  
  @JSImport("gremlin", "process.TextP")
  @js.native
  class TextP protected () extends StObject {
    def this(operator: EnumValue, value: String) = this()
    def this(operator: EnumValue, value: String, other: js.Any) = this()
    
    def and(): P = js.native
    def and(arg: js.Any): P = js.native
    
    def or(): P = js.native
    def or(arg: js.Any): P = js.native
  }
  object TextP {
    
    /* static member */
    @JSImport("gremlin", "process.TextP.containing")
    @js.native
    def containing(args: js.Any*): TextP = js.native
    
    /* static member */
    @JSImport("gremlin", "process.TextP.endingWith")
    @js.native
    def endingWith(args: js.Any*): TextP = js.native
    
    /* static member */
    @JSImport("gremlin", "process.TextP.notContaining")
    @js.native
    def notContaining(args: js.Any*): TextP = js.native
    
    /* static member */
    @JSImport("gremlin", "process.TextP.notEndingWith")
    @js.native
    def notEndingWith(args: js.Any*): TextP = js.native
    
    /* static member */
    @JSImport("gremlin", "process.TextP.notStartingWith")
    @js.native
    def notStartingWith(args: js.Any*): TextP = js.native
    
    /* static member */
    @JSImport("gremlin", "process.TextP.startingWith")
    @js.native
    def startingWith(args: js.Any*): TextP = js.native
  }
  
  @JSImport("gremlin", "process.Translator")
  @js.native
  class Translator protected () extends StObject {
    def this(traversalSource: AnonymousTraversalSource[GraphTraversalSource[GraphTraversal]]) = this()
    def this(traversalSource: GraphTraversalSource[GraphTraversal]) = this()
    
    def getTraversalSource(): Translator = js.native
    
    def of(traversalSource: String): Unit = js.native
    def of(traversalSource: AnonymousTraversalSource[GraphTraversalSource[GraphTraversal]]): Unit = js.native
    def of(traversalSource: GraphTraversalSource[GraphTraversal]): Unit = js.native
    
    def translate(bytecode: Bytecode): String = js.native
  }
  
  @JSImport("gremlin", "process.TraversalSideEffects")
  @js.native
  class TraversalSideEffects () extends StObject
  
  @JSImport("gremlin", "process.TraversalStrategies")
  @js.native
  class TraversalStrategies () extends StObject {
    def this(parent: TraversalStrategies) = this()
    
    def addStrategy(strategy: TraversalStrategy): Unit = js.native
    
    def applyStrategies(traversal: Traversal_): js.Promise[Traversal_] = js.native
  }
  
  @JSImport("gremlin", "process.TraversalStrategy")
  @js.native
  class TraversalStrategy () extends StObject {
    
    @JSName("apply")
    def apply(traversal: Traversal_): js.Promise[Traversal_] = js.native
  }
  
  @JSImport("gremlin", "process.Traversal")
  @js.native
  class Traversal_ protected ()
    extends AsyncIterableIterator[js.Any] {
    def this(graph: Nullable[Graph], traversalStrategies: Nullable[TraversalStrategies], bytecode: Bytecode) = this()
    
    def getBytecode(): Bytecode = js.native
    
    def hasNext(): js.Promise[Boolean] = js.native
    
    def iterate(): js.Promise[Unit] = js.native
    
    def next(): js.Promise[IteratorResult[_, _]] = js.native
    
    def toList(): js.Promise[js.Array[Traverser]] = js.native
  }
  
  @JSImport("gremlin", "process.Traverser")
  @js.native
  class Traverser protected () extends StObject {
    def this(`object`: js.Any) = this()
    def this(`object`: js.Any, bulk: Double) = this()
  }
  
  object barrier {
    
    @JSImport("gremlin", "process.barrier")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("gremlin", "process.barrier.normsack")
    @js.native
    def normsack: EnumValue = js.native
    @scala.inline
    def normsack_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normsack")(x.asInstanceOf[js.Any])
  }
  
  object cardinality {
    
    @JSImport("gremlin", "process.cardinality")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("gremlin", "process.cardinality.list")
    @js.native
    def list: EnumValue = js.native
    @scala.inline
    def list_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("list")(x.asInstanceOf[js.Any])
    
    @JSImport("gremlin", "process.cardinality.set")
    @js.native
    def set: EnumValue = js.native
    @scala.inline
    def set_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set")(x.asInstanceOf[js.Any])
    
    @JSImport("gremlin", "process.cardinality.single")
    @js.native
    def single: EnumValue = js.native
    @scala.inline
    def single_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("single")(x.asInstanceOf[js.Any])
  }
  
  object column {
    
    @JSImport("gremlin", "process.column")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("gremlin", "process.column.keys")
    @js.native
    def keys: EnumValue = js.native
    @scala.inline
    def keys_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keys")(x.asInstanceOf[js.Any])
    
    @JSImport("gremlin", "process.column.values")
    @js.native
    def values: EnumValue = js.native
    @scala.inline
    def values_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("values")(x.asInstanceOf[js.Any])
  }
  
  object direction {
    
    @JSImport("gremlin", "process.direction")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("gremlin", "process.direction.both")
    @js.native
    def both: EnumValue = js.native
    @scala.inline
    def both_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("both")(x.asInstanceOf[js.Any])
    
    @JSImport("gremlin", "process.direction.in")
    @js.native
    def in: EnumValue = js.native
    @scala.inline
    def in_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("in")(x.asInstanceOf[js.Any])
    
    @JSImport("gremlin", "process.direction.out")
    @js.native
    def out: EnumValue = js.native
    @scala.inline
    def out_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("out")(x.asInstanceOf[js.Any])
  }
  
  object graphSONVersion {
    
    @JSImport("gremlin", "process.graphSONVersion")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("gremlin", "process.graphSONVersion.v1_0")
    @js.native
    def v10: EnumValue = js.native
    
    @scala.inline
    def v10_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1_0")(x.asInstanceOf[js.Any])
    
    @JSImport("gremlin", "process.graphSONVersion.v2_0")
    @js.native
    def v20: EnumValue = js.native
    
    @scala.inline
    def v20_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2_0")(x.asInstanceOf[js.Any])
    
    @JSImport("gremlin", "process.graphSONVersion.v3_0")
    @js.native
    def v30: EnumValue = js.native
    
    @scala.inline
    def v30_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v3_0")(x.asInstanceOf[js.Any])
  }
  
  object gryoVersion {
    
    @JSImport("gremlin", "process.gryoVersion")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("gremlin", "process.gryoVersion.v1_0")
    @js.native
    def v10: EnumValue = js.native
    
    @scala.inline
    def v10_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1_0")(x.asInstanceOf[js.Any])
    
    @JSImport("gremlin", "process.gryoVersion.v3_0")
    @js.native
    def v30: EnumValue = js.native
    
    @scala.inline
    def v30_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v3_0")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("gremlin", "process.operator")
  @js.native
  val operator: Operator_ = js.native
  
  object order {
    
    @JSImport("gremlin", "process.order")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("gremlin", "process.order.asc")
    @js.native
    def asc: EnumValue = js.native
    @scala.inline
    def asc_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asc")(x.asInstanceOf[js.Any])
    
    @JSImport("gremlin", "process.order.decr")
    @js.native
    def decr: EnumValue = js.native
    @scala.inline
    def decr_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decr")(x.asInstanceOf[js.Any])
    
    @JSImport("gremlin", "process.order.desc")
    @js.native
    def desc: EnumValue = js.native
    @scala.inline
    def desc_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desc")(x.asInstanceOf[js.Any])
    
    @JSImport("gremlin", "process.order.incr")
    @js.native
    def incr: EnumValue = js.native
    @scala.inline
    def incr_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("incr")(x.asInstanceOf[js.Any])
    
    @JSImport("gremlin", "process.order.shuffle")
    @js.native
    def shuffle: EnumValue = js.native
    @scala.inline
    def shuffle_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shuffle")(x.asInstanceOf[js.Any])
  }
  
  object pick {
    
    @JSImport("gremlin", "process.pick")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("gremlin", "process.pick.any")
    @js.native
    def any: EnumValue = js.native
    @scala.inline
    def any_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("any")(x.asInstanceOf[js.Any])
    
    @JSImport("gremlin", "process.pick.none")
    @js.native
    def none: EnumValue = js.native
    @scala.inline
    def none_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
  }
  
  object pop {
    
    @JSImport("gremlin", "process.pop")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("gremlin", "process.pop.all")
    @js.native
    def all: EnumValue = js.native
    @scala.inline
    def all_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
    
    @JSImport("gremlin", "process.pop.first")
    @js.native
    def first: EnumValue = js.native
    @scala.inline
    def first_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("first")(x.asInstanceOf[js.Any])
    
    @JSImport("gremlin", "process.pop.last")
    @js.native
    def last: EnumValue = js.native
    @scala.inline
    def last_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("last")(x.asInstanceOf[js.Any])
    
    @JSImport("gremlin", "process.pop.mixed")
    @js.native
    def mixed: EnumValue = js.native
    @scala.inline
    def mixed_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mixed")(x.asInstanceOf[js.Any])
  }
  
  object scope {
    
    @JSImport("gremlin", "process.scope")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("gremlin", "process.scope.global")
    @js.native
    def global: EnumValue = js.native
    @scala.inline
    def global_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("global")(x.asInstanceOf[js.Any])
    
    @JSImport("gremlin", "process.scope.local")
    @js.native
    def local: EnumValue = js.native
    @scala.inline
    def local_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("local")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("gremlin", "process.statics")
  @js.native
  val statics: Statics_[GraphTraversal] = js.native
  
  object t {
    
    @JSImport("gremlin", "process.t")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("gremlin", "process.t.id")
    @js.native
    def id: EnumValue = js.native
    @scala.inline
    def id_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSImport("gremlin", "process.t.key")
    @js.native
    def key: EnumValue = js.native
    @scala.inline
    def key_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("key")(x.asInstanceOf[js.Any])
    
    @JSImport("gremlin", "process.t.label")
    @js.native
    def label: EnumValue = js.native
    @scala.inline
    def label_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("gremlin", "process.t.value")
    @js.native
    def value: EnumValue = js.native
    @scala.inline
    def value_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("gremlin", "process.traversal")
  @js.native
  def traversal[S /* <: GraphTraversalSource[GraphTraversal] */](): AnonymousTraversalSource[S] = js.native
  @JSImport("gremlin", "process.traversal")
  @js.native
  def traversal[S /* <: GraphTraversalSource[GraphTraversal] */](traversalSourceClass: Newable[S]): AnonymousTraversalSource[S] = js.native
  
  @JSImport("gremlin", "process.withOptions")
  @js.native
  val withOptions: WithOptions_ = js.native
  
  @js.native
  trait Operator_ extends StObject {
    
    var addall: EnumValue = js.native
    
    var and: EnumValue = js.native
    
    var assign: EnumValue = js.native
    
    var div: EnumValue = js.native
    
    var max: EnumValue = js.native
    
    var min: EnumValue = js.native
    
    var minus: EnumValue = js.native
    
    var mult: EnumValue = js.native
    
    var or: EnumValue = js.native
    
    var sum: EnumValue = js.native
    
    var sumlong: EnumValue = js.native
  }
  object Operator_ {
    
    @scala.inline
    def apply(
      addall: EnumValue,
      and: EnumValue,
      assign: EnumValue,
      div: EnumValue,
      max: EnumValue,
      min: EnumValue,
      minus: EnumValue,
      mult: EnumValue,
      or: EnumValue,
      sum: EnumValue,
      sumlong: EnumValue
    ): Operator_ = {
      val __obj = js.Dynamic.literal(addall = addall.asInstanceOf[js.Any], and = and.asInstanceOf[js.Any], assign = assign.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minus = minus.asInstanceOf[js.Any], mult = mult.asInstanceOf[js.Any], or = or.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], sumlong = sumlong.asInstanceOf[js.Any])
      __obj.asInstanceOf[Operator_]
    }
    
    @scala.inline
    implicit class Operator_MutableBuilder[Self <: Operator_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddall(value: EnumValue): Self = StObject.set(x, "addall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnd(value: EnumValue): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssign(value: EnumValue): Self = StObject.set(x, "assign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiv(value: EnumValue): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: EnumValue): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: EnumValue): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinus(value: EnumValue): Self = StObject.set(x, "minus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMult(value: EnumValue): Self = StObject.set(x, "mult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOr(value: EnumValue): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSum(value: EnumValue): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSumlong(value: EnumValue): Self = StObject.set(x, "sumlong", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Statics_[T /* <: GraphTraversal */] extends StObject {
    
    def V(args: js.Any*): T = js.native
    
    def addE(args: js.Any*): T = js.native
    
    def addV(args: js.Any*): T = js.native
    
    def aggregate(args: js.Any*): T = js.native
    
    def and(args: js.Any*): T = js.native
    
    def as(args: js.Any*): T = js.native
    
    def barrier(args: js.Any*): T = js.native
    
    def both(args: js.Any*): T = js.native
    
    def bothE(args: js.Any*): T = js.native
    
    def bothV(args: js.Any*): T = js.native
    
    def branch(args: js.Any*): T = js.native
    
    def cap(args: js.Any*): T = js.native
    
    def choose(args: js.Any*): T = js.native
    
    def coalesce(args: js.Any*): T = js.native
    
    def coin(args: js.Any*): T = js.native
    
    def constant(args: js.Any*): T = js.native
    
    def count(args: js.Any*): T = js.native
    
    def cyclicPath(args: js.Any*): T = js.native
    
    def dedup(args: js.Any*): T = js.native
    
    def drop(args: js.Any*): T = js.native
    
    def elementMap(args: js.Any*): T = js.native
    
    def emit(args: js.Any*): T = js.native
    
    def filter(args: js.Any*): T = js.native
    
    def flatMap(args: js.Any*): T = js.native
    
    def fold(args: js.Any*): T = js.native
    
    def group(args: js.Any*): T = js.native
    
    def groupCount(args: js.Any*): T = js.native
    
    def has(args: js.Any*): T = js.native
    
    def hasId(args: js.Any*): T = js.native
    
    def hasKey(args: js.Any*): T = js.native
    
    def hasLabel(args: js.Any*): T = js.native
    
    def hasNot(args: js.Any*): T = js.native
    
    def hasValue(args: js.Any*): T = js.native
    
    def id(args: js.Any*): T = js.native
    
    def identity(args: js.Any*): T = js.native
    
    def inE(args: js.Any*): T = js.native
    
    def inV(args: js.Any*): T = js.native
    
    def in_(args: js.Any*): T = js.native
    
    def index(args: js.Any*): T = js.native
    
    def inject(args: js.Any*): T = js.native
    
    def is(args: js.Any*): T = js.native
    
    def key(args: js.Any*): T = js.native
    
    def label(args: js.Any*): T = js.native
    
    def limit(args: js.Any*): T = js.native
    
    def local(args: js.Any*): T = js.native
    
    def loops(args: js.Any*): T = js.native
    
    def map(args: js.Any*): T = js.native
    
    def `match`(args: js.Any*): T = js.native
    
    def math(args: js.Any*): T = js.native
    
    def max(args: js.Any*): T = js.native
    
    def mean(args: js.Any*): T = js.native
    
    def min(args: js.Any*): T = js.native
    
    def not(args: js.Any*): T = js.native
    
    def optional(args: js.Any*): T = js.native
    
    def or(args: js.Any*): T = js.native
    
    def order(args: js.Any*): T = js.native
    
    def otherV(args: js.Any*): T = js.native
    
    def out(args: js.Any*): T = js.native
    
    def outE(args: js.Any*): T = js.native
    
    def outV(args: js.Any*): T = js.native
    
    def path(args: js.Any*): T = js.native
    
    def project(args: js.Any*): T = js.native
    
    def properties(args: js.Any*): T = js.native
    
    def property(args: js.Any*): T = js.native
    
    def propertyMap(args: js.Any*): T = js.native
    
    def range(args: js.Any*): T = js.native
    
    def repeat(args: js.Any*): T = js.native
    
    def sack(args: js.Any*): T = js.native
    
    def sample(args: js.Any*): T = js.native
    
    def select(args: js.Any*): T = js.native
    
    def sideEffect(args: js.Any*): T = js.native
    
    def simplePath(args: js.Any*): T = js.native
    
    def skip(args: js.Any*): T = js.native
    
    def store(args: js.Any*): T = js.native
    
    def subgraph(args: js.Any*): T = js.native
    
    def sum(args: js.Any*): T = js.native
    
    def tail(args: js.Any*): T = js.native
    
    def timeLimit(args: js.Any*): T = js.native
    
    def times(args: js.Any*): T = js.native
    
    def to(args: js.Any*): T = js.native
    
    def toE(args: js.Any*): T = js.native
    
    def toV(args: js.Any*): T = js.native
    
    def tree(args: js.Any*): T = js.native
    
    def unfold(args: js.Any*): T = js.native
    
    def union(args: js.Any*): T = js.native
    
    def until(args: js.Any*): T = js.native
    
    def value(args: js.Any*): T = js.native
    
    def valueMap(args: js.Any*): T = js.native
    
    def values(args: js.Any*): T = js.native
    
    def where(args: js.Any*): T = js.native
  }
  object Statics_ {
    
    @scala.inline
    def apply[T /* <: GraphTraversal */](
      V: /* repeated */ js.Any => T,
      addE: /* repeated */ js.Any => T,
      addV: /* repeated */ js.Any => T,
      aggregate: /* repeated */ js.Any => T,
      and: /* repeated */ js.Any => T,
      as: /* repeated */ js.Any => T,
      barrier: /* repeated */ js.Any => T,
      both: /* repeated */ js.Any => T,
      bothE: /* repeated */ js.Any => T,
      bothV: /* repeated */ js.Any => T,
      branch: /* repeated */ js.Any => T,
      cap: /* repeated */ js.Any => T,
      choose: /* repeated */ js.Any => T,
      coalesce: /* repeated */ js.Any => T,
      coin: /* repeated */ js.Any => T,
      constant: /* repeated */ js.Any => T,
      count: /* repeated */ js.Any => T,
      cyclicPath: /* repeated */ js.Any => T,
      dedup: /* repeated */ js.Any => T,
      drop: /* repeated */ js.Any => T,
      elementMap: /* repeated */ js.Any => T,
      emit: /* repeated */ js.Any => T,
      filter: /* repeated */ js.Any => T,
      flatMap: /* repeated */ js.Any => T,
      fold: /* repeated */ js.Any => T,
      group: /* repeated */ js.Any => T,
      groupCount: /* repeated */ js.Any => T,
      has: /* repeated */ js.Any => T,
      hasId: /* repeated */ js.Any => T,
      hasKey: /* repeated */ js.Any => T,
      hasLabel: /* repeated */ js.Any => T,
      hasNot: /* repeated */ js.Any => T,
      hasValue: /* repeated */ js.Any => T,
      id: /* repeated */ js.Any => T,
      identity: /* repeated */ js.Any => T,
      inE: /* repeated */ js.Any => T,
      inV: /* repeated */ js.Any => T,
      in_ : /* repeated */ js.Any => T,
      index: /* repeated */ js.Any => T,
      inject: /* repeated */ js.Any => T,
      is: /* repeated */ js.Any => T,
      key: /* repeated */ js.Any => T,
      label: /* repeated */ js.Any => T,
      limit: /* repeated */ js.Any => T,
      local: /* repeated */ js.Any => T,
      loops: /* repeated */ js.Any => T,
      map: /* repeated */ js.Any => T,
      `match`: /* repeated */ js.Any => T,
      math: /* repeated */ js.Any => T,
      max: /* repeated */ js.Any => T,
      mean: /* repeated */ js.Any => T,
      min: /* repeated */ js.Any => T,
      not: /* repeated */ js.Any => T,
      optional: /* repeated */ js.Any => T,
      or: /* repeated */ js.Any => T,
      order: /* repeated */ js.Any => T,
      otherV: /* repeated */ js.Any => T,
      out: /* repeated */ js.Any => T,
      outE: /* repeated */ js.Any => T,
      outV: /* repeated */ js.Any => T,
      path: /* repeated */ js.Any => T,
      project: /* repeated */ js.Any => T,
      properties: /* repeated */ js.Any => T,
      property: /* repeated */ js.Any => T,
      propertyMap: /* repeated */ js.Any => T,
      range: /* repeated */ js.Any => T,
      repeat: /* repeated */ js.Any => T,
      sack: /* repeated */ js.Any => T,
      sample: /* repeated */ js.Any => T,
      select: /* repeated */ js.Any => T,
      sideEffect: /* repeated */ js.Any => T,
      simplePath: /* repeated */ js.Any => T,
      skip: /* repeated */ js.Any => T,
      store: /* repeated */ js.Any => T,
      subgraph: /* repeated */ js.Any => T,
      sum: /* repeated */ js.Any => T,
      tail: /* repeated */ js.Any => T,
      timeLimit: /* repeated */ js.Any => T,
      times: /* repeated */ js.Any => T,
      to: /* repeated */ js.Any => T,
      toE: /* repeated */ js.Any => T,
      toV: /* repeated */ js.Any => T,
      tree: /* repeated */ js.Any => T,
      unfold: /* repeated */ js.Any => T,
      union: /* repeated */ js.Any => T,
      until: /* repeated */ js.Any => T,
      value: /* repeated */ js.Any => T,
      valueMap: /* repeated */ js.Any => T,
      values: /* repeated */ js.Any => T,
      where: /* repeated */ js.Any => T
    ): Statics_[T] = {
      val __obj = js.Dynamic.literal(V = js.Any.fromFunction1(V), addE = js.Any.fromFunction1(addE), addV = js.Any.fromFunction1(addV), aggregate = js.Any.fromFunction1(aggregate), and = js.Any.fromFunction1(and), as = js.Any.fromFunction1(as), barrier = js.Any.fromFunction1(barrier), both = js.Any.fromFunction1(both), bothE = js.Any.fromFunction1(bothE), bothV = js.Any.fromFunction1(bothV), branch = js.Any.fromFunction1(branch), cap = js.Any.fromFunction1(cap), choose = js.Any.fromFunction1(choose), coalesce = js.Any.fromFunction1(coalesce), coin = js.Any.fromFunction1(coin), constant = js.Any.fromFunction1(constant), count = js.Any.fromFunction1(count), cyclicPath = js.Any.fromFunction1(cyclicPath), dedup = js.Any.fromFunction1(dedup), drop = js.Any.fromFunction1(drop), elementMap = js.Any.fromFunction1(elementMap), emit = js.Any.fromFunction1(emit), filter = js.Any.fromFunction1(filter), flatMap = js.Any.fromFunction1(flatMap), fold = js.Any.fromFunction1(fold), group = js.Any.fromFunction1(group), groupCount = js.Any.fromFunction1(groupCount), has = js.Any.fromFunction1(has), hasId = js.Any.fromFunction1(hasId), hasKey = js.Any.fromFunction1(hasKey), hasLabel = js.Any.fromFunction1(hasLabel), hasNot = js.Any.fromFunction1(hasNot), hasValue = js.Any.fromFunction1(hasValue), id = js.Any.fromFunction1(id), identity = js.Any.fromFunction1(identity), inE = js.Any.fromFunction1(inE), inV = js.Any.fromFunction1(inV), in_ = js.Any.fromFunction1(in_), index = js.Any.fromFunction1(index), inject = js.Any.fromFunction1(inject), is = js.Any.fromFunction1(is), key = js.Any.fromFunction1(key), label = js.Any.fromFunction1(label), limit = js.Any.fromFunction1(limit), local = js.Any.fromFunction1(local), loops = js.Any.fromFunction1(loops), map = js.Any.fromFunction1(map), math = js.Any.fromFunction1(math), max = js.Any.fromFunction1(max), mean = js.Any.fromFunction1(mean), min = js.Any.fromFunction1(min), not = js.Any.fromFunction1(not), optional = js.Any.fromFunction1(optional), or = js.Any.fromFunction1(or), order = js.Any.fromFunction1(order), otherV = js.Any.fromFunction1(otherV), out = js.Any.fromFunction1(out), outE = js.Any.fromFunction1(outE), outV = js.Any.fromFunction1(outV), path = js.Any.fromFunction1(path), project = js.Any.fromFunction1(project), properties = js.Any.fromFunction1(properties), property = js.Any.fromFunction1(property), propertyMap = js.Any.fromFunction1(propertyMap), range = js.Any.fromFunction1(range), repeat = js.Any.fromFunction1(repeat), sack = js.Any.fromFunction1(sack), sample = js.Any.fromFunction1(sample), select = js.Any.fromFunction1(select), sideEffect = js.Any.fromFunction1(sideEffect), simplePath = js.Any.fromFunction1(simplePath), skip = js.Any.fromFunction1(skip), store = js.Any.fromFunction1(store), subgraph = js.Any.fromFunction1(subgraph), sum = js.Any.fromFunction1(sum), tail = js.Any.fromFunction1(tail), timeLimit = js.Any.fromFunction1(timeLimit), times = js.Any.fromFunction1(times), to = js.Any.fromFunction1(to), toE = js.Any.fromFunction1(toE), toV = js.Any.fromFunction1(toV), tree = js.Any.fromFunction1(tree), unfold = js.Any.fromFunction1(unfold), union = js.Any.fromFunction1(union), until = js.Any.fromFunction1(until), value = js.Any.fromFunction1(value), valueMap = js.Any.fromFunction1(valueMap), values = js.Any.fromFunction1(values), where = js.Any.fromFunction1(where))
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.asInstanceOf[Statics_[T]]
    }
    
    @scala.inline
    implicit class Statics_MutableBuilder[Self <: Statics_[_], T /* <: GraphTraversal */] (val x: Self with Statics_[T]) extends AnyVal {
      
      @scala.inline
      def setAddE(value: /* repeated */ js.Any => T): Self = StObject.set(x, "addE", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddV(value: /* repeated */ js.Any => T): Self = StObject.set(x, "addV", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAggregate(value: /* repeated */ js.Any => T): Self = StObject.set(x, "aggregate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAnd(value: /* repeated */ js.Any => T): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAs(value: /* repeated */ js.Any => T): Self = StObject.set(x, "as", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBarrier(value: /* repeated */ js.Any => T): Self = StObject.set(x, "barrier", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBoth(value: /* repeated */ js.Any => T): Self = StObject.set(x, "both", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBothE(value: /* repeated */ js.Any => T): Self = StObject.set(x, "bothE", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBothV(value: /* repeated */ js.Any => T): Self = StObject.set(x, "bothV", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBranch(value: /* repeated */ js.Any => T): Self = StObject.set(x, "branch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCap(value: /* repeated */ js.Any => T): Self = StObject.set(x, "cap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChoose(value: /* repeated */ js.Any => T): Self = StObject.set(x, "choose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCoalesce(value: /* repeated */ js.Any => T): Self = StObject.set(x, "coalesce", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCoin(value: /* repeated */ js.Any => T): Self = StObject.set(x, "coin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConstant(value: /* repeated */ js.Any => T): Self = StObject.set(x, "constant", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCount(value: /* repeated */ js.Any => T): Self = StObject.set(x, "count", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCyclicPath(value: /* repeated */ js.Any => T): Self = StObject.set(x, "cyclicPath", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDedup(value: /* repeated */ js.Any => T): Self = StObject.set(x, "dedup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrop(value: /* repeated */ js.Any => T): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setElementMap(value: /* repeated */ js.Any => T): Self = StObject.set(x, "elementMap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmit(value: /* repeated */ js.Any => T): Self = StObject.set(x, "emit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilter(value: /* repeated */ js.Any => T): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlatMap(value: /* repeated */ js.Any => T): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFold(value: /* repeated */ js.Any => T): Self = StObject.set(x, "fold", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGroup(value: /* repeated */ js.Any => T): Self = StObject.set(x, "group", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGroupCount(value: /* repeated */ js.Any => T): Self = StObject.set(x, "groupCount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHas(value: /* repeated */ js.Any => T): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasId(value: /* repeated */ js.Any => T): Self = StObject.set(x, "hasId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasKey(value: /* repeated */ js.Any => T): Self = StObject.set(x, "hasKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasLabel(value: /* repeated */ js.Any => T): Self = StObject.set(x, "hasLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasNot(value: /* repeated */ js.Any => T): Self = StObject.set(x, "hasNot", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasValue(value: /* repeated */ js.Any => T): Self = StObject.set(x, "hasValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setId(value: /* repeated */ js.Any => T): Self = StObject.set(x, "id", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIdentity(value: /* repeated */ js.Any => T): Self = StObject.set(x, "identity", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInE(value: /* repeated */ js.Any => T): Self = StObject.set(x, "inE", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInV(value: /* repeated */ js.Any => T): Self = StObject.set(x, "inV", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIn_(value: /* repeated */ js.Any => T): Self = StObject.set(x, "in_", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIndex(value: /* repeated */ js.Any => T): Self = StObject.set(x, "index", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInject(value: /* repeated */ js.Any => T): Self = StObject.set(x, "inject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIs(value: /* repeated */ js.Any => T): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKey(value: /* repeated */ js.Any => T): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLabel(value: /* repeated */ js.Any => T): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLimit(value: /* repeated */ js.Any => T): Self = StObject.set(x, "limit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLocal(value: /* repeated */ js.Any => T): Self = StObject.set(x, "local", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoops(value: /* repeated */ js.Any => T): Self = StObject.set(x, "loops", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMap(value: /* repeated */ js.Any => T): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMatch(value: /* repeated */ js.Any => T): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMath(value: /* repeated */ js.Any => T): Self = StObject.set(x, "math", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMax(value: /* repeated */ js.Any => T): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMean(value: /* repeated */ js.Any => T): Self = StObject.set(x, "mean", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMin(value: /* repeated */ js.Any => T): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNot(value: /* repeated */ js.Any => T): Self = StObject.set(x, "not", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOptional(value: /* repeated */ js.Any => T): Self = StObject.set(x, "optional", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOr(value: /* repeated */ js.Any => T): Self = StObject.set(x, "or", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOrder(value: /* repeated */ js.Any => T): Self = StObject.set(x, "order", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOtherV(value: /* repeated */ js.Any => T): Self = StObject.set(x, "otherV", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOut(value: /* repeated */ js.Any => T): Self = StObject.set(x, "out", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOutE(value: /* repeated */ js.Any => T): Self = StObject.set(x, "outE", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOutV(value: /* repeated */ js.Any => T): Self = StObject.set(x, "outV", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPath(value: /* repeated */ js.Any => T): Self = StObject.set(x, "path", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProject(value: /* repeated */ js.Any => T): Self = StObject.set(x, "project", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProperties(value: /* repeated */ js.Any => T): Self = StObject.set(x, "properties", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProperty(value: /* repeated */ js.Any => T): Self = StObject.set(x, "property", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPropertyMap(value: /* repeated */ js.Any => T): Self = StObject.set(x, "propertyMap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRange(value: /* repeated */ js.Any => T): Self = StObject.set(x, "range", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRepeat(value: /* repeated */ js.Any => T): Self = StObject.set(x, "repeat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSack(value: /* repeated */ js.Any => T): Self = StObject.set(x, "sack", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSample(value: /* repeated */ js.Any => T): Self = StObject.set(x, "sample", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelect(value: /* repeated */ js.Any => T): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSideEffect(value: /* repeated */ js.Any => T): Self = StObject.set(x, "sideEffect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSimplePath(value: /* repeated */ js.Any => T): Self = StObject.set(x, "simplePath", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSkip(value: /* repeated */ js.Any => T): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStore(value: /* repeated */ js.Any => T): Self = StObject.set(x, "store", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubgraph(value: /* repeated */ js.Any => T): Self = StObject.set(x, "subgraph", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSum(value: /* repeated */ js.Any => T): Self = StObject.set(x, "sum", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTail(value: /* repeated */ js.Any => T): Self = StObject.set(x, "tail", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTimeLimit(value: /* repeated */ js.Any => T): Self = StObject.set(x, "timeLimit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTimes(value: /* repeated */ js.Any => T): Self = StObject.set(x, "times", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTo(value: /* repeated */ js.Any => T): Self = StObject.set(x, "to", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToE(value: /* repeated */ js.Any => T): Self = StObject.set(x, "toE", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToV(value: /* repeated */ js.Any => T): Self = StObject.set(x, "toV", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTree(value: /* repeated */ js.Any => T): Self = StObject.set(x, "tree", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnfold(value: /* repeated */ js.Any => T): Self = StObject.set(x, "unfold", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnion(value: /* repeated */ js.Any => T): Self = StObject.set(x, "union", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUntil(value: /* repeated */ js.Any => T): Self = StObject.set(x, "until", js.Any.fromFunction1(value))
      
      @scala.inline
      def setV(value: /* repeated */ js.Any => T): Self = StObject.set(x, "V", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValue(value: /* repeated */ js.Any => T): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValueMap(value: /* repeated */ js.Any => T): Self = StObject.set(x, "valueMap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValues(value: /* repeated */ js.Any => T): Self = StObject.set(x, "values", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWhere(value: /* repeated */ js.Any => T): Self = StObject.set(x, "where", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait WithOptions_ extends StObject {
    
    var all: Double = js.native
    
    var ids: Double = js.native
    
    var indexer: String = js.native
    
    var keys: Double = js.native
    
    var labels: Double = js.native
    
    var list: Double = js.native
    
    var map: Double = js.native
    
    var none: Double = js.native
    
    var tokens: String = js.native
    
    var values: Double = js.native
  }
  object WithOptions_ {
    
    @scala.inline
    def apply(
      all: Double,
      ids: Double,
      indexer: String,
      keys: Double,
      labels: Double,
      list: Double,
      map: Double,
      none: Double,
      tokens: String,
      values: Double
    ): WithOptions_ = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], indexer = indexer.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithOptions_]
    }
    
    @scala.inline
    implicit class WithOptions_MutableBuilder[Self <: WithOptions_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAll(value: Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIds(value: Double): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexer(value: String): Self = StObject.set(x, "indexer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeys(value: Double): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabels(value: Double): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setList(value: Double): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: Double): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNone(value: Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokens(value: String): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: Double): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
}
