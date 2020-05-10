organization := "org.scalablytyped.slinky"
name := "angular__platform-browser"
version := "8.2.14-8ff34f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "angular__animations" % "8.2.14-28001c",
  "org.scalablytyped.slinky" %%% "angular__common" % "8.2.14-bd40cd",
  "org.scalablytyped.slinky" %%% "angular__compiler" % "8.2.14-d3d8bb",
  "org.scalablytyped.slinky" %%% "angular__core" % "8.2.14-655360",
  "org.scalablytyped.slinky" %%% "inquirer" % "6.5-dt-20200226Z-18490c",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.4-f7a9ee",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.4-484a39",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20200225Z-2cdc6d",
  "org.scalablytyped.slinky" %%% "typescript" % "3.8.3-961b8f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
