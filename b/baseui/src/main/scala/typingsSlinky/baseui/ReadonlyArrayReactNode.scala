package typingsSlinky.baseui

import slinky.core.TagMod
import typingsSlinky.baseui.baseuiNumbers.`7`
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Array<react.react.ReactNode>> */
trait ReadonlyArrayReactNode extends js.Object {
  val concat: js.Function1[/* repeated */ js.Array[TagMod[Any]], js.Array[TagMod[Any]]]
  val copyWithin: js.Function2[/* target */ Double, /* start */ Double, this.type]
  val entries: js.Function0[IterableIterator[js.Tuple2[Double, TagMod[Any]]]]
  val every: js.Function1[
    /* callbackfn */ js.Function3[/* value */ TagMod[Any], /* index */ Double, /* array */ js.Array[TagMod[Any]], _], 
    Boolean
  ]
  val fill: js.Function1[/* value */ TagMod[Any], this.type]
  val filter: js.Function1[
    /* callbackfn */ js.Function3[
      /* value */ TagMod[Any], 
      /* index */ Double, 
      /* array */ js.Array[TagMod[Any]], 
      /* is react.react.ReactNode */ Boolean
    ], 
    js.Array[TagMod[Any]]
  ]
  val find: js.Function1[
    /* predicate */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ TagMod[Any], 
      /* index */ Double, 
      /* obj */ js.Array[TagMod[Any]], 
      /* is react.react.ReactNode */ Boolean
    ], 
    js.UndefOr[TagMod[Any]]
  ]
  val findIndex: js.Function1[
    /* predicate */ js.Function3[/* value */ TagMod[Any], /* index */ Double, /* obj */ js.Array[TagMod[Any]], _], 
    Double
  ]
  val flat: js.ThisFunction1[
    /* this */ js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[_]]]]]]]], 
    `7`, 
    js.Array[_]
  ]
  val flatMap: js.Function1[
    /* callback */ js.ThisFunction3[
      /* this */ js.UndefOr[scala.Nothing], 
      /* value */ TagMod[Any], 
      /* index */ Double, 
      /* array */ js.Array[TagMod[Any]], 
      _ | js.Array[_]
    ], 
    js.Array[_]
  ]
  val forEach: js.Function1[
    /* callbackfn */ js.Function3[/* value */ TagMod[Any], /* index */ Double, /* array */ js.Array[TagMod[Any]], Unit], 
    Unit
  ]
  val includes: js.Function1[/* searchElement */ TagMod[Any], Boolean]
  val indexOf: js.Function1[/* searchElement */ TagMod[Any], Double]
  val join: js.Function0[String]
  val keys: js.Function0[IterableIterator[Double]]
  val lastIndexOf: js.Function1[/* searchElement */ TagMod[Any], Double]
  val length: Double
  val map: js.Function1[
    /* callbackfn */ js.Function3[/* value */ TagMod[Any], /* index */ Double, /* array */ js.Array[TagMod[Any]], _], 
    js.Array[_]
  ]
  val pop: js.Function0[js.UndefOr[TagMod[Any]]]
  val push: js.Function1[/* repeated */ TagMod[Any], Double]
  val reduce: js.Function1[
    /* callbackfn */ js.Function4[
      /* previousValue */ TagMod[Any], 
      /* currentValue */ TagMod[Any], 
      /* currentIndex */ Double, 
      /* array */ js.Array[TagMod[Any]], 
      TagMod[Any]
    ], 
    TagMod[Any]
  ]
  val reduceRight: js.Function1[
    /* callbackfn */ js.Function4[
      /* previousValue */ TagMod[Any], 
      /* currentValue */ TagMod[Any], 
      /* currentIndex */ Double, 
      /* array */ js.Array[TagMod[Any]], 
      TagMod[Any]
    ], 
    TagMod[Any]
  ]
  val reverse: js.Function0[js.Array[TagMod[Any]]]
  val shift: js.Function0[js.UndefOr[TagMod[Any]]]
  val slice: js.Function0[js.Array[TagMod[Any]]]
  val some: js.Function1[
    /* callbackfn */ js.Function3[/* value */ TagMod[Any], /* index */ Double, /* array */ js.Array[TagMod[Any]], _], 
    Boolean
  ]
  val sort: js.Function0[this.type]
  val splice: js.Function1[/* start */ Double, js.Array[TagMod[Any]]]
  @JSName("toLocaleString")
  val toLocaleString_FReadonlyArrayReactNode: js.Function0[String]
  @JSName("toString")
  val toString_FReadonlyArrayReactNode: js.Function0[String]
  val unshift: js.Function1[/* repeated */ TagMod[Any], Double]
  val values: js.Function0[IterableIterator[TagMod[Any]]]
}

object ReadonlyArrayReactNode {
  @scala.inline
  def apply(
    concat: /* repeated */ js.Array[TagMod[Any]] => js.Array[TagMod[Any]],
    copyWithin: (/* target */ Double, /* start */ Double) => ReadonlyArrayReactNode,
    entries: () => IterableIterator[js.Tuple2[Double, TagMod[Any]]],
    every: /* callbackfn */ js.Function3[/* value */ TagMod[Any], /* index */ Double, /* array */ js.Array[TagMod[Any]], _] => Boolean,
    fill: /* value */ TagMod[Any] => ReadonlyArrayReactNode,
    filter: /* callbackfn */ js.Function3[
      /* value */ TagMod[Any], 
      /* index */ Double, 
      /* array */ js.Array[TagMod[Any]], 
      /* is react.react.ReactNode */ Boolean
    ] => js.Array[TagMod[Any]],
    find: /* predicate */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ TagMod[Any], 
      /* index */ Double, 
      /* obj */ js.Array[TagMod[Any]], 
      /* is react.react.ReactNode */ Boolean
    ] => js.UndefOr[TagMod[Any]],
    findIndex: /* predicate */ js.Function3[/* value */ TagMod[Any], /* index */ Double, /* obj */ js.Array[TagMod[Any]], _] => Double,
    flat: js.ThisFunction1[
      /* this */ js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[_]]]]]]]], 
      `7`, 
      js.Array[_]
    ],
    flatMap: /* callback */ js.ThisFunction3[
      /* this */ js.UndefOr[scala.Nothing], 
      /* value */ TagMod[Any], 
      /* index */ Double, 
      /* array */ js.Array[TagMod[Any]], 
      _ | js.Array[_]
    ] => js.Array[_],
    forEach: /* callbackfn */ js.Function3[/* value */ TagMod[Any], /* index */ Double, /* array */ js.Array[TagMod[Any]], Unit] => Unit,
    includes: /* searchElement */ TagMod[Any] => Boolean,
    indexOf: /* searchElement */ TagMod[Any] => Double,
    join: () => String,
    keys: () => IterableIterator[Double],
    lastIndexOf: /* searchElement */ TagMod[Any] => Double,
    length: Double,
    map: /* callbackfn */ js.Function3[/* value */ TagMod[Any], /* index */ Double, /* array */ js.Array[TagMod[Any]], _] => js.Array[_],
    pop: () => js.UndefOr[TagMod[Any]],
    push: /* repeated */ TagMod[Any] => Double,
    reduce: /* callbackfn */ js.Function4[
      /* previousValue */ TagMod[Any], 
      /* currentValue */ TagMod[Any], 
      /* currentIndex */ Double, 
      /* array */ js.Array[TagMod[Any]], 
      TagMod[Any]
    ] => TagMod[Any],
    reduceRight: /* callbackfn */ js.Function4[
      /* previousValue */ TagMod[Any], 
      /* currentValue */ TagMod[Any], 
      /* currentIndex */ Double, 
      /* array */ js.Array[TagMod[Any]], 
      TagMod[Any]
    ] => TagMod[Any],
    reverse: () => js.Array[TagMod[Any]],
    shift: () => js.UndefOr[TagMod[Any]],
    slice: () => js.Array[TagMod[Any]],
    some: /* callbackfn */ js.Function3[/* value */ TagMod[Any], /* index */ Double, /* array */ js.Array[TagMod[Any]], _] => Boolean,
    sort: () => ReadonlyArrayReactNode,
    splice: /* start */ Double => js.Array[TagMod[Any]],
    toLocaleString: () => String,
    toString: () => String,
    unshift: /* repeated */ TagMod[Any] => Double,
    values: () => IterableIterator[TagMod[Any]]
  ): ReadonlyArrayReactNode = {
    val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat), copyWithin = js.Any.fromFunction2(copyWithin), entries = js.Any.fromFunction0(entries), every = js.Any.fromFunction1(every), fill = js.Any.fromFunction1(fill), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), findIndex = js.Any.fromFunction1(findIndex), flat = flat.asInstanceOf[js.Any], flatMap = js.Any.fromFunction1(flatMap), forEach = js.Any.fromFunction1(forEach), includes = js.Any.fromFunction1(includes), indexOf = js.Any.fromFunction1(indexOf), join = js.Any.fromFunction0(join), keys = js.Any.fromFunction0(keys), lastIndexOf = js.Any.fromFunction1(lastIndexOf), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), reduce = js.Any.fromFunction1(reduce), reduceRight = js.Any.fromFunction1(reduceRight), reverse = js.Any.fromFunction0(reverse), shift = js.Any.fromFunction0(shift), slice = js.Any.fromFunction0(slice), some = js.Any.fromFunction1(some), sort = js.Any.fromFunction0(sort), splice = js.Any.fromFunction1(splice), toLocaleString = js.Any.fromFunction0(toLocaleString), toString = js.Any.fromFunction0(toString), unshift = js.Any.fromFunction1(unshift), values = js.Any.fromFunction0(values))
  
    __obj.asInstanceOf[ReadonlyArrayReactNode]
  }
}

