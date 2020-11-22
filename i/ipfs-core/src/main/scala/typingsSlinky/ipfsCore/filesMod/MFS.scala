package typingsSlinky.ipfsCore.filesMod

import org.scalajs.dom.raw.Blob
import typingsSlinky.ipfsCore.anon.IpldIPLD
import typingsSlinky.ipfsCore.chmodMod.ChmodOptions
import typingsSlinky.ipfsCore.cpMod.CpOptions
import typingsSlinky.ipfsCore.filesRmMod.RmOptions
import typingsSlinky.ipfsCore.filesStatMod.Stat
import typingsSlinky.ipfsCore.filesStatMod.StatOptions
import typingsSlinky.ipfsCore.lsMod.UnixFSEntry
import typingsSlinky.ipfsCore.mkdirMod.MkdirOptions
import typingsSlinky.ipfsCore.mvMod.MvOptions
import typingsSlinky.ipfsCore.readMod.ReadOptions
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import typingsSlinky.ipfsCore.touchMod.TouchOptions
import typingsSlinky.ipfsCore.writeMod.WriteOptions
import typingsSlinky.std.AsyncIterable
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MFS extends js.Object {
  
  var chmod: ReturnType[
    js.Function1[
      /* context */ _, 
      js.Function3[
        /* path */ String, 
        /* mode */ String | Double, 
        /* options */ js.UndefOr[ChmodOptions with AbortOptions], 
        js.Promise[Unit]
      ]
    ]
  ] = js.native
  
  var cp: ReturnType[
    js.Function1[
      /* context */ _, 
      js.Function1[
        /* args */ (js.Tuple2[String | typingsSlinky.cids.mod.^ , js.UndefOr[CpOptions]]) | (js.Tuple3[
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          js.UndefOr[CpOptions]
        ]) | (js.Tuple4[
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          js.UndefOr[CpOptions]
        ]) | (js.Tuple5[
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          js.UndefOr[CpOptions]
        ]) | (js.Tuple6[
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          js.UndefOr[CpOptions]
        ]) | (js.Tuple7[
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          js.UndefOr[CpOptions]
        ]) | (js.Tuple8[
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          js.UndefOr[CpOptions]
        ]) | (js.Tuple9[
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          String | typingsSlinky.cids.mod.^ , 
          js.UndefOr[CpOptions]
        ]), 
        js.Promise[Unit]
      ]
    ]
  ] = js.native
  
  var flush: ReturnType[
    js.Function1[
      /* context */ _, 
      js.Function2[
        /* path */ String, 
        /* options */ js.UndefOr[AbortOptions], 
        js.Promise[typingsSlinky.cids.mod.^]
      ]
    ]
  ] = js.native
  
  var ls: ReturnType[
    js.Function1[
      /* context */ _, 
      js.Function2[
        /* path */ String, 
        /* options */ js.UndefOr[AbortOptions], 
        AsyncIterable[UnixFSEntry]
      ]
    ]
  ] = js.native
  
  var mkdir: ReturnType[
    js.Function1[
      /* context */ _, 
      js.Function2[
        /* path */ String, 
        /* options */ js.UndefOr[MkdirOptions with AbortOptions], 
        js.Promise[Unit]
      ]
    ]
  ] = js.native
  
  var mv: ReturnType[
    js.Function1[
      /* context */ _, 
      js.Function1[
        /* args */ (js.Tuple3[String, String, js.UndefOr[MvOptions]]) | (js.Tuple4[String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple5[String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple6[String, String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple7[String, String, String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple8[String, String, String, String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple9[String, String, String, String, String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple10[String, String, String, String, String, String, String, String, String, js.UndefOr[MvOptions]]), 
        js.Promise[Unit]
      ]
    ]
  ] = js.native
  
  var read: ReturnType[
    js.Function1[
      /* context */ _, 
      js.Function2[
        /* path */ String | typingsSlinky.cids.mod.^ , 
        /* options */ js.UndefOr[ReadOptions with AbortOptions], 
        AsyncIterable[js.typedarray.Uint8Array]
      ]
    ]
  ] = js.native
  
  var rm: ReturnType[
    js.Function1[
      /* context */ _, 
      js.Function1[
        /* args */ (js.Tuple2[String, js.UndefOr[RmOptions]]) | (js.Tuple3[String, String, js.UndefOr[RmOptions]]) | (js.Tuple4[String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple5[String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple6[String, String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple7[String, String, String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple8[String, String, String, String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple9[String, String, String, String, String, String, String, String, js.UndefOr[RmOptions]]), 
        js.Promise[Unit]
      ]
    ]
  ] = js.native
  
  var stat: ReturnType[
    js.Function1[
      /* context */ IpldIPLD, 
      js.Function2[
        /* path */ String, 
        /* options */ js.UndefOr[StatOptions with AbortOptions], 
        js.Promise[Stat]
      ]
    ]
  ] = js.native
  
  var touch: ReturnType[
    js.Function1[
      /* context */ _, 
      js.Function2[
        /* path */ String, 
        /* options */ js.UndefOr[TouchOptions with AbortOptions], 
        js.Promise[Unit]
      ]
    ]
  ] = js.native
  
  var write: ReturnType[
    js.Function1[
      /* context */ _, 
      js.Function3[
        /* path */ String, 
        /* content */ String | js.typedarray.Uint8Array | AsyncIterable[js.typedarray.Uint8Array] | Blob, 
        /* options */ js.UndefOr[WriteOptions with AbortOptions], 
        js.Promise[Unit]
      ]
    ]
  ] = js.native
}
object MFS {
  
  @scala.inline
  def apply(
    chmod: ReturnType[
      js.Function1[
        /* context */ _, 
        js.Function3[
          /* path */ String, 
          /* mode */ String | Double, 
          /* options */ js.UndefOr[ChmodOptions with AbortOptions], 
          js.Promise[Unit]
        ]
      ]
    ],
    cp: ReturnType[
      js.Function1[
        /* context */ _, 
        js.Function1[
          /* args */ (js.Tuple2[String | typingsSlinky.cids.mod.^ , js.UndefOr[CpOptions]]) | (js.Tuple3[
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            js.UndefOr[CpOptions]
          ]) | (js.Tuple4[
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            js.UndefOr[CpOptions]
          ]) | (js.Tuple5[
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            js.UndefOr[CpOptions]
          ]) | (js.Tuple6[
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            js.UndefOr[CpOptions]
          ]) | (js.Tuple7[
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            js.UndefOr[CpOptions]
          ]) | (js.Tuple8[
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            js.UndefOr[CpOptions]
          ]) | (js.Tuple9[
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            String | typingsSlinky.cids.mod.^ , 
            js.UndefOr[CpOptions]
          ]), 
          js.Promise[Unit]
        ]
      ]
    ],
    flush: ReturnType[
      js.Function1[
        /* context */ _, 
        js.Function2[
          /* path */ String, 
          /* options */ js.UndefOr[AbortOptions], 
          js.Promise[typingsSlinky.cids.mod.^]
        ]
      ]
    ],
    ls: ReturnType[
      js.Function1[
        /* context */ _, 
        js.Function2[
          /* path */ String, 
          /* options */ js.UndefOr[AbortOptions], 
          AsyncIterable[UnixFSEntry]
        ]
      ]
    ],
    mkdir: ReturnType[
      js.Function1[
        /* context */ _, 
        js.Function2[
          /* path */ String, 
          /* options */ js.UndefOr[MkdirOptions with AbortOptions], 
          js.Promise[Unit]
        ]
      ]
    ],
    mv: ReturnType[
      js.Function1[
        /* context */ _, 
        js.Function1[
          /* args */ (js.Tuple3[String, String, js.UndefOr[MvOptions]]) | (js.Tuple4[String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple5[String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple6[String, String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple7[String, String, String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple8[String, String, String, String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple9[String, String, String, String, String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple10[String, String, String, String, String, String, String, String, String, js.UndefOr[MvOptions]]), 
          js.Promise[Unit]
        ]
      ]
    ],
    read: ReturnType[
      js.Function1[
        /* context */ _, 
        js.Function2[
          /* path */ String | typingsSlinky.cids.mod.^ , 
          /* options */ js.UndefOr[ReadOptions with AbortOptions], 
          AsyncIterable[js.typedarray.Uint8Array]
        ]
      ]
    ],
    rm: ReturnType[
      js.Function1[
        /* context */ _, 
        js.Function1[
          /* args */ (js.Tuple2[String, js.UndefOr[RmOptions]]) | (js.Tuple3[String, String, js.UndefOr[RmOptions]]) | (js.Tuple4[String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple5[String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple6[String, String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple7[String, String, String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple8[String, String, String, String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple9[String, String, String, String, String, String, String, String, js.UndefOr[RmOptions]]), 
          js.Promise[Unit]
        ]
      ]
    ],
    stat: ReturnType[
      js.Function1[
        /* context */ IpldIPLD, 
        js.Function2[
          /* path */ String, 
          /* options */ js.UndefOr[StatOptions with AbortOptions], 
          js.Promise[Stat]
        ]
      ]
    ],
    touch: ReturnType[
      js.Function1[
        /* context */ _, 
        js.Function2[
          /* path */ String, 
          /* options */ js.UndefOr[TouchOptions with AbortOptions], 
          js.Promise[Unit]
        ]
      ]
    ],
    write: ReturnType[
      js.Function1[
        /* context */ _, 
        js.Function3[
          /* path */ String, 
          /* content */ String | js.typedarray.Uint8Array | AsyncIterable[js.typedarray.Uint8Array] | Blob, 
          /* options */ js.UndefOr[WriteOptions with AbortOptions], 
          js.Promise[Unit]
        ]
      ]
    ]
  ): MFS = {
    val __obj = js.Dynamic.literal(chmod = chmod.asInstanceOf[js.Any], cp = cp.asInstanceOf[js.Any], flush = flush.asInstanceOf[js.Any], ls = ls.asInstanceOf[js.Any], mkdir = mkdir.asInstanceOf[js.Any], mv = mv.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], rm = rm.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.asInstanceOf[MFS]
  }
  
  @scala.inline
  implicit class MFSOps[Self <: MFS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChmod(
      value: ReturnType[
          js.Function1[
            /* context */ _, 
            js.Function3[
              /* path */ String, 
              /* mode */ String | Double, 
              /* options */ js.UndefOr[ChmodOptions with AbortOptions], 
              js.Promise[Unit]
            ]
          ]
        ]
    ): Self = this.set("chmod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCp(
      value: ReturnType[
          js.Function1[
            /* context */ _, 
            js.Function1[
              /* args */ (js.Tuple2[String | typingsSlinky.cids.mod.^ , js.UndefOr[CpOptions]]) | (js.Tuple3[
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                js.UndefOr[CpOptions]
              ]) | (js.Tuple4[
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                js.UndefOr[CpOptions]
              ]) | (js.Tuple5[
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                js.UndefOr[CpOptions]
              ]) | (js.Tuple6[
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                js.UndefOr[CpOptions]
              ]) | (js.Tuple7[
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                js.UndefOr[CpOptions]
              ]) | (js.Tuple8[
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                js.UndefOr[CpOptions]
              ]) | (js.Tuple9[
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                String | typingsSlinky.cids.mod.^ , 
                js.UndefOr[CpOptions]
              ]), 
              js.Promise[Unit]
            ]
          ]
        ]
    ): Self = this.set("cp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlush(
      value: ReturnType[
          js.Function1[
            /* context */ _, 
            js.Function2[
              /* path */ String, 
              /* options */ js.UndefOr[AbortOptions], 
              js.Promise[typingsSlinky.cids.mod.^]
            ]
          ]
        ]
    ): Self = this.set("flush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLs(
      value: ReturnType[
          js.Function1[
            /* context */ _, 
            js.Function2[
              /* path */ String, 
              /* options */ js.UndefOr[AbortOptions], 
              AsyncIterable[UnixFSEntry]
            ]
          ]
        ]
    ): Self = this.set("ls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMkdir(
      value: ReturnType[
          js.Function1[
            /* context */ _, 
            js.Function2[
              /* path */ String, 
              /* options */ js.UndefOr[MkdirOptions with AbortOptions], 
              js.Promise[Unit]
            ]
          ]
        ]
    ): Self = this.set("mkdir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMv(
      value: ReturnType[
          js.Function1[
            /* context */ _, 
            js.Function1[
              /* args */ (js.Tuple3[String, String, js.UndefOr[MvOptions]]) | (js.Tuple4[String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple5[String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple6[String, String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple7[String, String, String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple8[String, String, String, String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple9[String, String, String, String, String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple10[String, String, String, String, String, String, String, String, String, js.UndefOr[MvOptions]]), 
              js.Promise[Unit]
            ]
          ]
        ]
    ): Self = this.set("mv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(
      value: ReturnType[
          js.Function1[
            /* context */ _, 
            js.Function2[
              /* path */ String | typingsSlinky.cids.mod.^ , 
              /* options */ js.UndefOr[ReadOptions with AbortOptions], 
              AsyncIterable[js.typedarray.Uint8Array]
            ]
          ]
        ]
    ): Self = this.set("read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRm(
      value: ReturnType[
          js.Function1[
            /* context */ _, 
            js.Function1[
              /* args */ (js.Tuple2[String, js.UndefOr[RmOptions]]) | (js.Tuple3[String, String, js.UndefOr[RmOptions]]) | (js.Tuple4[String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple5[String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple6[String, String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple7[String, String, String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple8[String, String, String, String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple9[String, String, String, String, String, String, String, String, js.UndefOr[RmOptions]]), 
              js.Promise[Unit]
            ]
          ]
        ]
    ): Self = this.set("rm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStat(
      value: ReturnType[
          js.Function1[
            /* context */ IpldIPLD, 
            js.Function2[
              /* path */ String, 
              /* options */ js.UndefOr[StatOptions with AbortOptions], 
              js.Promise[Stat]
            ]
          ]
        ]
    ): Self = this.set("stat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouch(
      value: ReturnType[
          js.Function1[
            /* context */ _, 
            js.Function2[
              /* path */ String, 
              /* options */ js.UndefOr[TouchOptions with AbortOptions], 
              js.Promise[Unit]
            ]
          ]
        ]
    ): Self = this.set("touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrite(
      value: ReturnType[
          js.Function1[
            /* context */ _, 
            js.Function3[
              /* path */ String, 
              /* content */ String | js.typedarray.Uint8Array | AsyncIterable[js.typedarray.Uint8Array] | Blob, 
              /* options */ js.UndefOr[WriteOptions with AbortOptions], 
              js.Promise[Unit]
            ]
          ]
        ]
    ): Self = this.set("write", value.asInstanceOf[js.Any])
  }
}
