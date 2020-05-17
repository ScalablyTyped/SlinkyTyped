package typingsSlinky.baseui.anon

import slinky.core.TagMod
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Array<react.react.ReactNode>> */
@js.native
trait ReadonlyArrayReactNode extends js.Object {
  val concat: js.Function1[/* repeated */ js.Array[TagMod[Any]], js.Array[TagMod[Any]]] = js.native
  val copyWithin: js.Function2[/* target */ Double, /* start */ Double, this.type] = js.native
  val entries: js.Function0[IterableIterator[js.Tuple2[Double, TagMod[Any]]]] = js.native
  val every: js.Function1[
    /* callbackfn */ js.Function3[/* value */ TagMod[Any], /* index */ Double, /* array */ js.Array[TagMod[Any]], _], 
    Boolean
  ] = js.native
  val fill: js.Function1[/* value */ TagMod[Any], this.type] = js.native
  val filter: js.Function1[
    /* callbackfn */ js.Function3[
      /* value */ TagMod[Any], 
      /* index */ Double, 
      /* array */ js.Array[TagMod[Any]], 
      /* is react.react.ReactNode */ Boolean
    ], 
    js.Array[TagMod[Any]]
  ] = js.native
  val find: js.Function1[
    /* predicate */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ TagMod[Any], 
      /* index */ Double, 
      /* obj */ js.Array[TagMod[Any]], 
      /* is react.react.ReactNode */ Boolean
    ], 
    js.UndefOr[TagMod[Any]]
  ] = js.native
  val findIndex: js.Function1[
    /* predicate */ js.Function3[/* value */ TagMod[Any], /* index */ Double, /* obj */ js.Array[TagMod[Any]], _], 
    Double
  ] = js.native
  val flat: js.ThisFunction1[
    /* this */ js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[_]]]]]]]], 
    typingsSlinky.baseui.baseuiNumbers.`7`, 
    js.Array[_]
  ] = js.native
  val flatMap: js.Function1[
    /* callback */ js.ThisFunction3[
      /* this */ js.UndefOr[scala.Nothing], 
      /* value */ TagMod[Any], 
      /* index */ Double, 
      /* array */ js.Array[TagMod[Any]], 
      _ | js.Array[_]
    ], 
    js.Array[_]
  ] = js.native
  val forEach: js.Function1[
    /* callbackfn */ js.Function3[/* value */ TagMod[Any], /* index */ Double, /* array */ js.Array[TagMod[Any]], Unit], 
    Unit
  ] = js.native
  val includes: js.Function1[/* searchElement */ TagMod[Any], Boolean] = js.native
  val indexOf: js.Function1[/* searchElement */ TagMod[Any], Double] = js.native
  val join: js.Function0[String] = js.native
  val keys: js.Function0[IterableIterator[Double]] = js.native
  val lastIndexOf: js.Function1[/* searchElement */ TagMod[Any], Double] = js.native
  val length: Double = js.native
  val map: js.Function1[
    /* callbackfn */ js.Function3[/* value */ TagMod[Any], /* index */ Double, /* array */ js.Array[TagMod[Any]], _], 
    js.Array[_]
  ] = js.native
  val pop: js.Function0[js.UndefOr[TagMod[Any]]] = js.native
  val push: js.Function1[/* repeated */ TagMod[Any], Double] = js.native
  val reduce: js.Function1[
    /* callbackfn */ js.Function4[
      /* previousValue */ TagMod[Any], 
      /* currentValue */ TagMod[Any], 
      /* currentIndex */ Double, 
      /* array */ js.Array[TagMod[Any]], 
      TagMod[Any]
    ], 
    TagMod[Any]
  ] = js.native
  val reduceRight: js.Function1[
    /* callbackfn */ js.Function4[
      /* previousValue */ TagMod[Any], 
      /* currentValue */ TagMod[Any], 
      /* currentIndex */ Double, 
      /* array */ js.Array[TagMod[Any]], 
      TagMod[Any]
    ], 
    TagMod[Any]
  ] = js.native
  val reverse: js.Function0[js.Array[TagMod[Any]]] = js.native
  val shift: js.Function0[js.UndefOr[TagMod[Any]]] = js.native
  val slice: js.Function0[js.Array[TagMod[Any]]] = js.native
  val some: js.Function1[
    /* callbackfn */ js.Function3[/* value */ TagMod[Any], /* index */ Double, /* array */ js.Array[TagMod[Any]], _], 
    Boolean
  ] = js.native
  val sort: js.Function0[this.type] = js.native
  val splice: js.Function1[/* start */ Double, js.Array[TagMod[Any]]] = js.native
  @JSName("toLocaleString")
  val toLocaleString_FReadonlyArrayReactNode: js.Function0[String] = js.native
  @JSName("toString")
  val toString_FReadonlyArrayReactNode: js.Function0[String] = js.native
  val unshift: js.Function1[/* repeated */ TagMod[Any], Double] = js.native
  val values: js.Function0[IterableIterator[TagMod[Any]]] = js.native
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
      typingsSlinky.baseui.baseuiNumbers.`7`, 
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
  @scala.inline
  implicit class ReadonlyArrayReactNodeOps[Self <: ReadonlyArrayReactNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConcat(value: /* repeated */ js.Array[TagMod[Any]] => js.Array[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCopyWithin(value: (/* target */ Double, /* start */ Double) => ReadonlyArrayReactNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyWithin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEntries(value: () => IterableIterator[js.Tuple2[Double, TagMod[Any]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEvery(
      value: /* callbackfn */ js.Function3[/* value */ TagMod[Any], /* index */ Double, /* array */ js.Array[TagMod[Any]], _] => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("every")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFill(value: /* value */ TagMod[Any] => ReadonlyArrayReactNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilter(
      value: /* callbackfn */ js.Function3[
          /* value */ TagMod[Any], 
          /* index */ Double, 
          /* array */ js.Array[TagMod[Any]], 
          /* is react.react.ReactNode */ Boolean
        ] => js.Array[TagMod[Any]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFind(
      value: /* predicate */ js.ThisFunction3[
          /* this */ Unit, 
          /* value */ TagMod[Any], 
          /* index */ Double, 
          /* obj */ js.Array[TagMod[Any]], 
          /* is react.react.ReactNode */ Boolean
        ] => js.UndefOr[TagMod[Any]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindIndex(
      value: /* predicate */ js.Function3[/* value */ TagMod[Any], /* index */ Double, /* obj */ js.Array[TagMod[Any]], _] => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFlat(
      value: js.ThisFunction1[
          /* this */ js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[_]]]]]]]], 
          typingsSlinky.baseui.baseuiNumbers.`7`, 
          js.Array[_]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlatMap(
      value: /* callback */ js.ThisFunction3[
          /* this */ js.UndefOr[scala.Nothing], 
          /* value */ TagMod[Any], 
          /* index */ Double, 
          /* array */ js.Array[TagMod[Any]], 
          _ | js.Array[_]
        ] => js.Array[_]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatMap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withForEach(
      value: /* callbackfn */ js.Function3[/* value */ TagMod[Any], /* index */ Double, /* array */ js.Array[TagMod[Any]], Unit] => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIncludes(value: /* searchElement */ TagMod[Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIndexOf(value: /* searchElement */ TagMod[Any] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withJoin(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKeys(value: () => IterableIterator[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLastIndexOf(value: /* searchElement */ TagMod[Any] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastIndexOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMap(
      value: /* callbackfn */ js.Function3[/* value */ TagMod[Any], /* index */ Double, /* array */ js.Array[TagMod[Any]], _] => js.Array[_]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPop(value: () => js.UndefOr[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPush(value: /* repeated */ TagMod[Any] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReduce(
      value: /* callbackfn */ js.Function4[
          /* previousValue */ TagMod[Any], 
          /* currentValue */ TagMod[Any], 
          /* currentIndex */ Double, 
          /* array */ js.Array[TagMod[Any]], 
          TagMod[Any]
        ] => TagMod[Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduce")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReduceRight(
      value: /* callbackfn */ js.Function4[
          /* previousValue */ TagMod[Any], 
          /* currentValue */ TagMod[Any], 
          /* currentIndex */ Double, 
          /* array */ js.Array[TagMod[Any]], 
          TagMod[Any]
        ] => TagMod[Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduceRight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReverse(value: () => js.Array[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShift(value: () => js.UndefOr[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSlice(value: () => js.Array[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slice")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSome(
      value: /* callbackfn */ js.Function3[/* value */ TagMod[Any], /* index */ Double, /* array */ js.Array[TagMod[Any]], _] => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("some")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSort(value: () => ReadonlyArrayReactNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSplice(value: /* start */ Double => js.Array[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splice")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToLocaleString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toLocaleString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnshift(value: /* repeated */ TagMod[Any] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unshift")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValues(value: () => IterableIterator[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

