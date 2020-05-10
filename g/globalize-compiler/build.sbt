organization := "org.scalablytyped.slinky"
name := "globalize-compiler"
version := "v0.2.0-dt-20200225Z-0367eb"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "cldrjs" % "0.4.4-dt-20200304Z-037d3e",
  "org.scalablytyped.slinky" %%% "estree" % "0.0-unknown-dt-20200320Z-3b5711",
  "org.scalablytyped.slinky" %%% "globalize" % "0.0-unknown-dt-20200226Z-804447",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
