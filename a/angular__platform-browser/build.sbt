organization := "org.scalablytyped.slinky"
name := "angular__platform-browser"
version := "8.2.14-17284a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "angular__animations" % "8.2.14-0240bc",
  "org.scalablytyped.slinky" %%% "angular__common" % "8.2.14-e283d0",
  "org.scalablytyped.slinky" %%% "angular__compiler" % "8.2.14-59f7dd",
  "org.scalablytyped.slinky" %%% "angular__core" % "8.2.14-2a8bdd",
  "org.scalablytyped.slinky" %%% "inquirer" % "6.5-dt-20190731Z-5c7cdf",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.3-54aa37",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.3-14d83f",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20190322Z-2708b6",
  "org.scalablytyped.slinky" %%% "typescript" % "3.7.2-436da2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        