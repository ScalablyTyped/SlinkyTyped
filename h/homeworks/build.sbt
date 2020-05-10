organization := "org.scalablytyped.slinky"
name := "homeworks"
version := "1.0.50-60ab0c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "angular__compiler" % "8.2.14-d3d8bb",
  "org.scalablytyped.slinky" %%% "angular__core" % "8.2.14-655360",
  "org.scalablytyped.slinky" %%% "angular__forms" % "8.2.14-d85ffa",
  "org.scalablytyped.slinky" %%% "inquirer" % "6.5-dt-20200226Z-18490c",
  "org.scalablytyped.slinky" %%% "jquery" % "3.3-dt-20200427Z-d88135",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.4-f7a9ee",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.4-484a39",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20181006Z-1b2bf8",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20200225Z-2cdc6d",
  "org.scalablytyped.slinky" %%% "typescript" % "3.8.3-961b8f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
